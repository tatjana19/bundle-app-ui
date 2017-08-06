/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.bundle.app.spring;

import java.io.IOException;

import javax.xml.parsers.FactoryConfigurationError;

import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import de.alpharogroup.bundle.app.MainFrame;
import de.alpharogroup.bundle.app.spring.config.PersistenceJPAConfig;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * The Class SpringApplicationContext.
 */
@Slf4j
public class SpringApplicationContext {

	/** The instance. */
	private static SpringApplicationContext instance = new SpringApplicationContext();

	/**
	 * Gets the single instance of SpringApplicationContext.
	 *
	 * @return single instance of SpringApplicationContext
	 */
	public static SpringApplicationContext getInstance() {
		return instance;
	}

	/** The application context. */
	@Getter
	private final ApplicationContext applicationContext;

	/**
	 * Instantiates a new spring application context.
	 */
	private SpringApplicationContext() {


		ApplicationContext dbApplicationContext = MainFrame.getInstance().getBundleAppDbAppContext().get(MainFrame.KEY_DB_APPLICATION_CONTEXT);
		if(dbApplicationContext == null) {
			// connect to bundle app...
			final ApplicationContext ctx = new AnnotationConfigApplicationContext(
				PersistenceJPAConfig.class);
			MainFrame.getInstance().getBundleAppDbAppContext().put(MainFrame.KEY_DB_APPLICATION_CONTEXT, ctx);
			dbApplicationContext = MainFrame.getInstance().getBundleAppDbAppContext().get(MainFrame.KEY_DB_APPLICATION_CONTEXT);
		}

		final Resource resource = dbApplicationContext.getResource("classpath:conf/log4j/log4jconfig.xml");

		try {
			DOMConfigurator.configure(resource.getURL());
		} catch (final FactoryConfigurationError e) {
			log.error("FactoryConfigurationError:", e);
		} catch (final IOException e) {
			log.error("IOException:", e);
		}

		applicationContext = dbApplicationContext;
	}

}
