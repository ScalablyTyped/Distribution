package typings.zeroclipboard.ZC

import typings.zeroclipboard.AnonAftercopy
import typings.zeroclipboard.AnonBeforecopy
import typings.zeroclipboard.AnonName
import typings.zeroclipboard.zeroclipboardStrings.aftercopy
import typings.zeroclipboard.zeroclipboardStrings.beforecopy
import typings.zeroclipboard.zeroclipboardStrings.copy
import typings.zeroclipboard.zeroclipboardStrings.destroy
import typings.zeroclipboard.zeroclipboardStrings.error
import typings.zeroclipboard.zeroclipboardStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardCommon extends js.Object {
  /**
    * Clear the pending data of ALL formats for clipboard injection.
    */
  def clearData(): Unit = js.native
  /**
    * Clear the pending data of type format for clipboard injection.
    * @param {string} mimeType
    */
  def clearData(mimeType: String): Unit = js.native
  /**
    * Dispatch an event to all registered listeners. The emission of some types of events will result in side effects.
    * @param  {string} data
    * @param  {string} name
    * @return {any}
    */
  def emit(data: AnonName): js.Any = js.native
  /**
    * Dispatch an event to all registered listeners. The emission of some types of events will result in side effects.
    * @param  {string} eventType
    * @return {any}
    */
  def emit(eventType: String): js.Any = js.native
  @JSName("emit")
  def emit_aftercopy(eventType: aftercopy): Unit = js.native
  @JSName("emit")
  def emit_beforecopy(eventType: beforecopy): Unit = js.native
  @JSName("emit")
  def emit_copy(eventType: copy): js.Any = js.native
  @JSName("emit")
  def emit_destroy(eventType: destroy): Unit = js.native
  @JSName("emit")
  def emit_error(eventType: error): Unit = js.native
  @JSName("emit")
  def emit_ready(eventType: ready): Unit = js.native
  /**
    * Get a copy of the pending data of ALL formats for clipboard injection.
    * @return {Dictionary<string>}
    * @since 2.1.0
    */
  def getData(): Dictionary[String] = js.native
  /**
    * Get the pending data of type format for clipboard injection.
    * @param  {string} format
    * @return {string}
    * @since 2.1.0
    */
  def getData(format: String): String = js.native
  /**
    * Retrieves a copy of the map of registered listener functions/objects for ALL event types.
    * @return {Object}
    */
  def handlers(): AnonBeforecopy = js.native
  /**
    * Retrieves a copy of the registered listener functions/objects for the given eventType.
    * @param  {string} eventType
    * @return {EventListener<ZeroClipboardEvent>}
    */
  def handlers(eventType: String): js.Array[EventListenerOrEventListenerObject[ZeroClipboardEvent]] = js.native
  @JSName("handlers")
  def handlers_aftercopy(eventType: aftercopy): js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]] = js.native
  @JSName("handlers")
  def handlers_beforecopy(eventType: beforecopy): js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]] = js.native
  @JSName("handlers")
  def handlers_copy(eventType: copy): js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]] = js.native
  @JSName("handlers")
  def handlers_destroy(eventType: destroy): js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]] = js.native
  @JSName("handlers")
  def handlers_error(eventType: error): js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]] = js.native
  @JSName("handlers")
  def handlers_ready(eventType: ready): js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]] = js.native
  /**
    * Remove ALL listener functions/objects for ALL registered event types.
    */
  def off(): Unit = js.native
  def off(eventType: String): Unit = js.native
  def off(eventType: String, listener: EventListenerOrEventListenerObject[ZeroClipboardEvent]): Unit = js.native
  /**
    * Remove a set of eventType to listener function/object mappings.
    * @param {EventListener<ZeroClipboardErrorEvent>} listenerObj
    */
  def off(listenerObj: AnonAftercopy): Unit = js.native
  @JSName("off")
  def off_aftercopy(eventType: aftercopy): Unit = js.native
  @JSName("off")
  def off_aftercopy(eventType: aftercopy, listener: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]): Unit = js.native
  @JSName("off")
  def off_beforecopy(eventType: beforecopy): Unit = js.native
  @JSName("off")
  def off_beforecopy(eventType: beforecopy, listener: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]): Unit = js.native
  @JSName("off")
  def off_copy(eventType: copy): Unit = js.native
  @JSName("off")
  def off_copy(eventType: copy, listener: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]): Unit = js.native
  @JSName("off")
  def off_destroy(eventType: destroy): Unit = js.native
  @JSName("off")
  def off_destroy(eventType: destroy, listener: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]): Unit = js.native
  @JSName("off")
  def off_error(eventType: error): Unit = js.native
  @JSName("off")
  def off_error(eventType: error, listener: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]): Unit = js.native
  /**
    * Remove a set of eventType to listener function/object mappings.
    */
  @JSName("off")
  def off_ready(eventType: ready): Unit = js.native
  /**
    * Remove a listener function/object for an eventType.
    * @param {string} eventType
    * @param {EventListener<ZeroClipboardEvent>} listener
    */
  @JSName("off")
  def off_ready(eventType: ready, listener: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]): Unit = js.native
  /**
    * Add a listener function/object for an eventType. If called as a client method will be within the client instance.
    * @param {string} eventType
    * @param {EventListener<ZeroClipboardEvent>} listener
    */
  def on(eventType: String, listener: EventListenerOrEventListenerObject[ZeroClipboardEvent]): Unit = js.native
  /**
    * Add a set of eventType to listener function/object mappings.
    * @param {EventListener<ZeroClipboardErrorEvent>} listenerObj
    */
  def on(listenerObj: AnonAftercopy): Unit = js.native
  /**
    * The aftercopy event is fired when the text is copied [or failed to copy] to the clipboard.
    * @param {"aftercopy"} eventType
    * @param {EventListener<ZeroClipboardAfterCopyEvent>} listener
    */
  @JSName("on")
  def on_aftercopy(eventType: aftercopy, listener: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]): Unit = js.native
  /**
    * On click, the Flash object will fire off a beforecopy event. This event is generally only used for "UI
    * preparation" if you want to alter anything before the copy event fires.
    * IMPORTANT: Handlers of this event are expected to operate synchronously if they intend to be finished before
    * the "copy" event is triggered.
    * @param {"beforecopy"} eventType
    * @param {EventListener<ZeroClipboardBeforeCopyEvent>} listener
    */
  @JSName("on")
  def on_beforecopy(eventType: beforecopy, listener: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]): Unit = js.native
  /**
    * On click (and after the beforecopy event), the Flash object will fire off a copy event. If the HTML object has
    * data-clipboard-text or data-clipboard-target, then ZeroClipboard will take care of getting an initial set of
    * data. It will then invoke any copy event handlers, in which you can call event.clipboardData.setData to set the
    * text, which will complete the loop.
    * IMPORTANT: If a handler of this event intends to modify the pending data for clipboard injection, it MUST
    * operate synchronously in order to maintain the temporarily elevated permissions granted by the user's click
    * event. The most common "gotcha" for this restriction is if someone wants to make an asynchronous XMLHttpRequest
    * in response to the copy event to get the data to inject - this won't work; make it a synchronous XMLHttpRequest
    * instead, or do the work in advance before the copy event is fired.
    * @param {"copy"} eventType
    * @param {EventListener<ZeroClipboardCopyEvent>} listener
    */
  @JSName("on")
  def on_copy(eventType: copy, listener: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]): Unit = js.native
  /**
    * The destroy event is fired when ZeroClipboard.destroy() is invoked.
    * IMPORTANT: Handlers of this event are expected to operate synchronously if they intend to be finished before the
    * destruction is complete.
    * @param {"destroy"} eventType
    * @param {EventListener<ZeroClipboardDestroyEvent>} listener
    */
  @JSName("on")
  def on_destroy(eventType: destroy, listener: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]): Unit = js.native
  /**
    * The error event is fired under a number of conditions, which will be detailed as sub-sections. Some consumers
    * may not consider all error types to be critical, and thus ZeroClipboard does not take it upon itself to implode
    * by calling ZeroClipboard.destroy() under error conditions. However, many consumers may want to do just that.
    * @param {"error"} eventType
    * @param {EventListener<ZeroClipboardErrorEvent>} listener
    */
  @JSName("on")
  def on_error(eventType: error, listener: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]): Unit = js.native
  /**
    * The ready event is fired when the Flash SWF completes loading and is ready for action. Please note that you need
    * to set most configuration options [with ZeroClipboard.config(...)] before ZeroClipboard.create() is invoked.
    * @param {"ready"} eventType
    * @param {EventListener<ZeroClipboardReadyEvent>} listener
    */
  @JSName("on")
  def on_ready(eventType: ready, listener: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]): Unit = js.native
  /**
    * Set the pending data of various formats for clipboard injection. This particular function signature (passing in
    * an Object) will implicitly clear out any existing pending data.
    * @param {Dictionary<string>} data
    */
  def setData(data: Dictionary[String]): Unit = js.native
  /**
    * Set the pending data of type format for clipboard injection.
    * @param {string} format
    * @param {string} data
    */
  def setData(format: String, data: String): Unit = js.native
}

