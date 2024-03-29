package typings.zoneJs

import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright Google LLC All Rights Reserved.
  *
  * Use of this source code is governed by an MIT-style license that can be
  * found in the LICENSE file at https://angular.io/license
  */
/**
  * Additional `EventTarget` methods added by `Zone.js`.
  *
  * 1. removeAllListeners, remove all event listeners of the given event name.
  * 2. eventListeners, get all event listeners of the given event name.
  */
trait EventTarget extends StObject {
  
  /**
    *
    * Retrieve all event listeners by name.
    *
    * This method is optional because it may not be available if you use `noop zone` when
    * bootstrapping Angular application or disable the `EventTarget` monkey patch by `zone.js`.
    *
    * If the `eventName` is provided, will return an array of event handlers or event listener
    * objects of the given event.
    * If the `eventName` is not provided, will return all listeners.
    *
    * @param eventName the name of the event, such as click. This parameter is optional.
    */
  var eventListeners: js.UndefOr[
    js.Function1[/* eventName */ js.UndefOr[String], js.Array[EventListenerOrEventListenerObject]]
  ] = js.undefined
  
  /**
    *
    * Remove all event listeners by name for this event target.
    *
    * This method is optional because it may not be available if you use `noop zone` when
    * bootstrapping Angular application or disable the `EventTarget` monkey patch by `zone.js`.
    *
    * If the `eventName` is provided, will remove event listeners of that name.
    * If the `eventName` is not provided, will remove all event listeners associated with
    * `EventTarget`.
    *
    * @param eventName the name of the event, such as `click`. This parameter is optional.
    */
  var removeAllListeners: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[String], Unit]] = js.undefined
}
object EventTarget {
  
  inline def apply(): EventTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventTarget] (val x: Self) extends AnyVal {
    
    inline def setEventListeners(value: /* eventName */ js.UndefOr[String] => js.Array[EventListenerOrEventListenerObject]): Self = StObject.set(x, "eventListeners", js.Any.fromFunction1(value))
    
    inline def setEventListenersUndefined: Self = StObject.set(x, "eventListeners", js.undefined)
    
    inline def setRemoveAllListeners(value: /* eventName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction1(value))
    
    inline def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
  }
}
