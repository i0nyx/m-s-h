package by.onyx.web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by ONYX on 15.10.2017.
 */
public class Initializer implements WebApplicationInitializer {
    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // регистрируем конфигурацию созданую высше
        ctx.register(WebConfig.class);
        // добавляем в контекст слушателя с нашей конфигурацией
        servletContext.addListener(new ContextLoaderListener(ctx));

        ctx.setServletContext(servletContext);

        // настраиваем маппинг Dispatcher Servlet-а
        ServletRegistration.Dynamic servlet =
                servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        servlet.setInitParameter("throwExceptionIfNoHandlerFound", "true");
    }
}
