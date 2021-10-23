package com.calltouch.test;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.WebTarget;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

@ExtendWith(ArquillianExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserRestTest {

    private static final Logger logger = LoggerFactory.getLogger(UserRestTest.class);

    private Client client;

    private WebTarget webTarget;

    private static String jwt;

    @ArquillianResource
    private URL base;

    @Deployment
    public static WebArchive createDeployment() {

        logger.info("UserRestTest::createDeployment()");

        return ShrinkWrap.create(WebArchive.class, "jakarta-ee.war")
                .addAsResource("persistence.xml", "META-INF/persistence.xml")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @BeforeEach
    public void setUp() throws Exception {
        logger.info("UserRestTest::setUp()");
    }

    @AfterEach
    public void tearDown() throws Exception {
        logger.info("UserRestTest::tearDown()");
    }

    @Test
    @Order(1)
    void saveUser() throws Exception {
        System.out.println(1);
    }
}