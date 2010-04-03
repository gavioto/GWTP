package com.philbeaudoin.gwtp.mvp.client.annotations;

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



import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import com.philbeaudoin.gwtp.mvp.client.TabContainerPresenter;

/**
 * Use this annotation in classes implementing {@link TabContainerPresenter}.
 * This annotates a static field containing the type of the event fired 
 * when the tab container wants to discover its contained tabs. 
 * 
 * @author Philippe Beaudoin
 */
@Target(ElementType.FIELD)
public @interface RequestTabs {
}