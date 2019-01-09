package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardCommon extends js.Object {
  /**
    * Clear the pending data of ALL formats for clipboard injection.
    */
  def clearData(): scala.Unit = js.native
  /**
    * Clear the pending data of type format for clipboard injection.
    * @param {string} mimeType
    */
  def clearData(mimeType: java.lang.String): scala.Unit = js.native
  /**
    * Dispatch an event to all registered listeners. The emission of some types of events will result in side effects.
    * @param  {string} data
    * @param  {string} name
    * @return {any}
    */
  def emit(data: zeroclipboardLib.Anon_Name): js.Any = js.native
  /**
    * Dispatch an event to all registered listeners. The emission of some types of events will result in side effects.
    * @param  {string} eventType
    * @return {any}
    */
  def emit(eventType: java.lang.String): js.Any = js.native
  @JSName("emit")
  def emit_aftercopy(eventType: zeroclipboardLib.zeroclipboardLibStrings.aftercopy): scala.Unit = js.native
  @JSName("emit")
  def emit_beforecopy(eventType: zeroclipboardLib.zeroclipboardLibStrings.beforecopy): scala.Unit = js.native
  @JSName("emit")
  def emit_copy(eventType: zeroclipboardLib.zeroclipboardLibStrings.copy): js.Any = js.native
  @JSName("emit")
  def emit_destroy(eventType: zeroclipboardLib.zeroclipboardLibStrings.destroy): scala.Unit = js.native
  @JSName("emit")
  def emit_error(eventType: zeroclipboardLib.zeroclipboardLibStrings.error): scala.Unit = js.native
  @JSName("emit")
  def emit_ready(eventType: zeroclipboardLib.zeroclipboardLibStrings.ready): scala.Unit = js.native
  /**
    * Get a copy of the pending data of ALL formats for clipboard injection.
    * @return {Dictionary<string>}
    * @since 2.1.0
    */
  def getData(): Dictionary[java.lang.String] = js.native
  /**
    * Get the pending data of type format for clipboard injection.
    * @param  {string} format
    * @return {string}
    * @since 2.1.0
    */
  def getData(format: java.lang.String): java.lang.String = js.native
  /**
    * Retrieves a copy of the map of registered listener functions/objects for ALL event types.
    * @return {Object}
    */
  def handlers(): zeroclipboardLib.Anon_AftercopyBeforecopy = js.native
  /**
    * Retrieves a copy of the registered listener functions/objects for the given eventType.
    * @param  {string} eventType
    * @return {EventListener<ZeroClipboardEvent>}
    */
  def handlers(eventType: java.lang.String): js.Array[EventListenerOrEventListenerObject[ZeroClipboardEvent]] = js.native
  @JSName("handlers")
  def handlers_aftercopy(eventType: zeroclipboardLib.zeroclipboardLibStrings.aftercopy): js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]] = js.native
  @JSName("handlers")
  def handlers_beforecopy(eventType: zeroclipboardLib.zeroclipboardLibStrings.beforecopy): js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]] = js.native
  @JSName("handlers")
  def handlers_copy(eventType: zeroclipboardLib.zeroclipboardLibStrings.copy): js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]] = js.native
  @JSName("handlers")
  def handlers_destroy(eventType: zeroclipboardLib.zeroclipboardLibStrings.destroy): js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]] = js.native
  @JSName("handlers")
  def handlers_error(eventType: zeroclipboardLib.zeroclipboardLibStrings.error): js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]] = js.native
  @JSName("handlers")
  def handlers_ready(eventType: zeroclipboardLib.zeroclipboardLibStrings.ready): js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]] = js.native
  /**
    * Remove ALL listener functions/objects for ALL registered event types.
    */
  def off(): scala.Unit = js.native
  def off(eventType: java.lang.String): scala.Unit = js.native
  def off(eventType: java.lang.String, listener: EventListenerOrEventListenerObject[ZeroClipboardEvent]): scala.Unit = js.native
  /**
    * Remove a set of eventType to listener function/object mappings.
    * @param {EventListener<ZeroClipboardErrorEvent>} listenerObj
    */
  def off(listenerObj: zeroclipboardLib.Anon_Aftercopy): scala.Unit = js.native
  @JSName("off")
  def off_aftercopy(eventType: zeroclipboardLib.zeroclipboardLibStrings.aftercopy): scala.Unit = js.native
  @JSName("off")
  def off_aftercopy(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.aftercopy,
    listener: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]
  ): scala.Unit = js.native
  @JSName("off")
  def off_beforecopy(eventType: zeroclipboardLib.zeroclipboardLibStrings.beforecopy): scala.Unit = js.native
  @JSName("off")
  def off_beforecopy(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.beforecopy,
    listener: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]
  ): scala.Unit = js.native
  @JSName("off")
  def off_copy(eventType: zeroclipboardLib.zeroclipboardLibStrings.copy): scala.Unit = js.native
  @JSName("off")
  def off_copy(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.copy,
    listener: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]
  ): scala.Unit = js.native
  @JSName("off")
  def off_destroy(eventType: zeroclipboardLib.zeroclipboardLibStrings.destroy): scala.Unit = js.native
  @JSName("off")
  def off_destroy(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.destroy,
    listener: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]
  ): scala.Unit = js.native
  @JSName("off")
  def off_error(eventType: zeroclipboardLib.zeroclipboardLibStrings.error): scala.Unit = js.native
  @JSName("off")
  def off_error(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.error,
    listener: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]
  ): scala.Unit = js.native
  /**
    * Remove a set of eventType to listener function/object mappings.
    */
  @JSName("off")
  def off_ready(eventType: zeroclipboardLib.zeroclipboardLibStrings.ready): scala.Unit = js.native
  /**
    * Remove a listener function/object for an eventType.
    * @param {string} eventType
    * @param {EventListener<ZeroClipboardEvent>} listener
    */
  @JSName("off")
  def off_ready(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.ready,
    listener: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]
  ): scala.Unit = js.native
  /**
    * Add a listener function/object for an eventType. If called as a client method will be within the client instance.
    * @param {string} eventType
    * @param {EventListener<ZeroClipboardEvent>} listener
    */
  def on(eventType: java.lang.String, listener: EventListenerOrEventListenerObject[ZeroClipboardEvent]): scala.Unit = js.native
  /**
    * Add a set of eventType to listener function/object mappings.
    * @param {EventListener<ZeroClipboardErrorEvent>} listenerObj
    */
  def on(listenerObj: zeroclipboardLib.Anon_Aftercopy): scala.Unit = js.native
  /**
    * The aftercopy event is fired when the text is copied [or failed to copy] to the clipboard.
    * @param {"aftercopy"} eventType
    * @param {EventListener<ZeroClipboardAfterCopyEvent>} listener
    */
  @JSName("on")
  def on_aftercopy(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.aftercopy,
    listener: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]
  ): scala.Unit = js.native
  /**
    * On click, the Flash object will fire off a beforecopy event. This event is generally only used for "UI
    * preparation" if you want to alter anything before the copy event fires.
    * IMPORTANT: Handlers of this event are expected to operate synchronously if they intend to be finished before
    * the "copy" event is triggered.
    * @param {"beforecopy"} eventType
    * @param {EventListener<ZeroClipboardBeforeCopyEvent>} listener
    */
  @JSName("on")
  def on_beforecopy(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.beforecopy,
    listener: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]
  ): scala.Unit = js.native
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
  def on_copy(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.copy,
    listener: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]
  ): scala.Unit = js.native
  /**
    * The destroy event is fired when ZeroClipboard.destroy() is invoked.
    * IMPORTANT: Handlers of this event are expected to operate synchronously if they intend to be finished before the
    * destruction is complete.
    * @param {"destroy"} eventType
    * @param {EventListener<ZeroClipboardDestroyEvent>} listener
    */
  @JSName("on")
  def on_destroy(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.destroy,
    listener: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]
  ): scala.Unit = js.native
  /**
    * The error event is fired under a number of conditions, which will be detailed as sub-sections. Some consumers
    * may not consider all error types to be critical, and thus ZeroClipboard does not take it upon itself to implode
    * by calling ZeroClipboard.destroy() under error conditions. However, many consumers may want to do just that.
    * @param {"error"} eventType
    * @param {EventListener<ZeroClipboardErrorEvent>} listener
    */
  @JSName("on")
  def on_error(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.error,
    listener: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]
  ): scala.Unit = js.native
  /**
    * The ready event is fired when the Flash SWF completes loading and is ready for action. Please note that you need
    * to set most configuration options [with ZeroClipboard.config(...)] before ZeroClipboard.create() is invoked.
    * @param {"ready"} eventType
    * @param {EventListener<ZeroClipboardReadyEvent>} listener
    */
  @JSName("on")
  def on_ready(
    eventType: zeroclipboardLib.zeroclipboardLibStrings.ready,
    listener: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]
  ): scala.Unit = js.native
  /**
    * Set the pending data of various formats for clipboard injection. This particular function signature (passing in
    * an Object) will implicitly clear out any existing pending data.
    * @param {Dictionary<string>} data
    */
  def setData(data: Dictionary[java.lang.String]): scala.Unit = js.native
  /**
    * Set the pending data of type format for clipboard injection.
    * @param {string} format
    * @param {string} data
    */
  def setData(format: java.lang.String, data: java.lang.String): scala.Unit = js.native
}

