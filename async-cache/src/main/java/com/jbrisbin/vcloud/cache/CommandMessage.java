/*
 * Copyright (c) 2010 by J. Brisbin <jon@jbrisbin.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.jbrisbin.vcloud.cache;

/**
 * @author J. Brisbin <jon@jbrisbin.com>
 */
public class CommandMessage {

  String type;
  String exchange;
  String routingKey = "";
  byte[] body = new byte[0];

  public CommandMessage( String type, String exchange, String routingKey ) {
    this.type = type;
    this.exchange = exchange;
    this.routingKey = routingKey;
  }

  public CommandMessage( String type, String exchange, String routingKey, byte[] body ) {
    this.type = type;
    this.exchange = exchange;
    this.routingKey = routingKey;
    this.body = body;
  }

  public String getType() {
    return type;
  }

  public void setType( String type ) {
    this.type = type;
  }

  public String getExchange() {
    return exchange;
  }

  public void setExchange( String exchange ) {
    this.exchange = exchange;
  }

  public String getRoutingKey() {
    return routingKey;
  }

  public void setRoutingKey( String routingKey ) {
    this.routingKey = routingKey;
  }

  public byte[] getBody() {
    return body;
  }

  public void setBody( byte[] body ) {
    this.body = body;
  }
}
