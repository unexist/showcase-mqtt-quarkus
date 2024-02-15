/**
 * @package Quarkus-Messaging-Showcase
 *
 * @file Todo smallrye consumer
 * @copyright 2020-present Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the Apache License v2.0.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.adapter.smallrye;

import org.eclipse.microprofile.reactive.messaging.Acknowledgment;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TodoSmallryeConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(TodoSmallryeConsumer.class);

    @Incoming("todos-rye-in")
    @Acknowledgment(Acknowledgment.Strategy.PRE_PROCESSING)
    public void receive(String value) {
        LOGGER.info("Value: {}", value);

    }
}
