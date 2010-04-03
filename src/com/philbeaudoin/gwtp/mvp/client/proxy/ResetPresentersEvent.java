package com.philbeaudoin.gwtp.mvp.client.proxy;

/**
 * Copyright 2010 Philippe Beaudoin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import com.google.gwt.event.shared.GwtEvent;
import com.philbeaudoin.gwtp.mvp.client.EventBus;

public class ResetPresentersEvent extends GwtEvent<ResetPresentersHandler> {

  private static final Type<ResetPresentersHandler> type = new Type<ResetPresentersHandler>();

  public static Type<ResetPresentersHandler> getType() {
    return type;    
  }
  
  public static void fire( final EventBus eventBus ) {
    eventBus.fireEvent( new ResetPresentersEvent() );
  }

  @Override
  protected void dispatch(ResetPresentersHandler handler) {
    handler.onResetPresenters( this );
  }

  @Override
  public Type<ResetPresentersHandler> getAssociatedType() {
    return getType();
  }
  
}