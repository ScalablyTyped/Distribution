package typings.zeroclipboard

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import typings.zeroclipboard.anon.Aftercopy
import typings.zeroclipboard.anon.Beforecopy
import typings.zeroclipboard.anon.ClearData
import typings.zeroclipboard.anon.Name
import typings.zeroclipboard.zeroclipboardStrings.activeClass
import typings.zeroclipboard.zeroclipboardStrings.aftercopy
import typings.zeroclipboard.zeroclipboardStrings.autoActivate
import typings.zeroclipboard.zeroclipboardStrings.beforecopy
import typings.zeroclipboard.zeroclipboardStrings.bubbleEvents
import typings.zeroclipboard.zeroclipboardStrings.cacheBust
import typings.zeroclipboard.zeroclipboardStrings.containerClass
import typings.zeroclipboard.zeroclipboardStrings.containerId
import typings.zeroclipboard.zeroclipboardStrings.copy
import typings.zeroclipboard.zeroclipboardStrings.destroy
import typings.zeroclipboard.zeroclipboardStrings.error
import typings.zeroclipboard.zeroclipboardStrings.fixLineEndings
import typings.zeroclipboard.zeroclipboardStrings.flashLoadTimeout
import typings.zeroclipboard.zeroclipboardStrings.forceEnhancedClipboard
import typings.zeroclipboard.zeroclipboardStrings.forceHandCursor
import typings.zeroclipboard.zeroclipboardStrings.hoverClass
import typings.zeroclipboard.zeroclipboardStrings.ready
import typings.zeroclipboard.zeroclipboardStrings.swfObjectId
import typings.zeroclipboard.zeroclipboardStrings.swfPath
import typings.zeroclipboard.zeroclipboardStrings.title
import typings.zeroclipboard.zeroclipboardStrings.trustedDomains
import typings.zeroclipboard.zeroclipboardStrings.zIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZC {
  
  type Dictionary[T] = StringDictionary[T]
  
  // Generic version EventHandler containers.
  // Mimicking native interfaces in lib.dom.d.ts of the same name.
  type EventListener[T /* <: ZeroClipboardEvent */] = js.Function1[/* ev */ T, Unit]
  
  @js.native
  trait EventListenerObject[T /* <: ZeroClipboardEvent */] extends StObject {
    
    def handleEvent(ev: T): Unit = js.native
  }
  object EventListenerObject {
    
    @scala.inline
    def apply[T /* <: ZeroClipboardEvent */](handleEvent: T => Unit): EventListenerObject[T] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[EventListenerObject[T]]
    }
    
    @scala.inline
    implicit class EventListenerObjectMutableBuilder[Self <: EventListenerObject[_], T /* <: ZeroClipboardEvent */] (val x: Self with EventListenerObject[T]) extends AnyVal {
      
      @scala.inline
      def setHandleEvent(value: T => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  type EventListenerOrEventListenerObject[T /* <: ZeroClipboardEvent */] = EventListener[T] | EventListenerObject[T]
  
  // Basic collection types for shorthands and interoperation
  @js.native
  trait List[T] extends /* index */ NumberDictionary[T] {
    
    var length: Double = js.native
  }
  object List {
    
    @scala.inline
    def apply[T](length: Double): List[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[List[T]]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List[_], T] (val x: Self with List[T]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZeroClipboardAfterCopyEvent extends ZeroClipboardEvent {
    
    var data: Dictionary[String] = js.native
    
    var errors: js.Array[_] = js.native
    
    var success: Dictionary[Boolean] = js.native
  }
  object ZeroClipboardAfterCopyEvent {
    
    @scala.inline
    def apply(
      currentTarget: HTMLObjectElement,
      data: Dictionary[String],
      errors: js.Array[_],
      relatedTarget: HTMLElement,
      success: Dictionary[Boolean],
      target: HTMLElement,
      timeStamp: Double,
      `type`: String
    ): ZeroClipboardAfterCopyEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZeroClipboardAfterCopyEvent]
    }
    
    @scala.inline
    implicit class ZeroClipboardAfterCopyEventMutableBuilder[Self <: ZeroClipboardAfterCopyEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Dictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setSuccess(value: Dictionary[Boolean]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  type ZeroClipboardBeforeCopyEvent = ZeroClipboardEvent
  
  @js.native
  trait ZeroClipboardClient extends ZeroClipboardCommon {
    
    /**
      * Register clipboard actions for new element(s) to the client. This includes automatically invoking
      * ZeroClipboard.focus on the current element when it is hovered over, unless the autoActivate configuration
      * property is set to false.
      * @param  {Element[]} elements
      * @return {ZeroClipboardClient}
      */
    def clip(elements: List[Element]): ZeroClipboardClient = js.native
    /**
      * Register clipboard actions for new element(s) to the client. This includes automatically invoking
      * ZeroClipboard.focus on the current element when it is hovered over, unless the autoActivate configuration
      * property is set to false.
      * @param  {Element} element
      * @return {ZeroClipboardClient}
      */
    def clip(element: Element): ZeroClipboardClient = js.native
    
    /**
      * Remove all event handlers and unclip all clipped elements.
      */
    def destroy(): Unit = js.native
    
    /**
      * Get all of the elements to which this client is clipped/registered.
      * @return {HTMLElement[]}
      */
    def elements(): js.Array[HTMLElement] = js.native
    
    /**
      * A unique identifier for this ZeroClipboard client instance.
      * @type {string}
      */
    var id: String = js.native
    
    /**
      * Set the pending data of type "text/html" for clipboard injection.
      * @param {string} data
      */
    def setHtml(data: String): Unit = js.native
    
    /**
      * Set the pending data of type "application/rtf" for clipboard injection.
      * @param {string} data
      */
    def setRichText(data: String): Unit = js.native
    
    /**
      * Set the pending data of type "text/plain" for clipboard injection.
      * @param {string} data
      */
    def setText(data: String): Unit = js.native
    
    /**
      * Unregister the clipboard actions of previously registered element(s) on the page. If no elements are provided,
      * ALL clipped/registered elements will be unregistered.
      * @param  {Element} element
      * @return {ZeroClipboardClient}
      */
    def unclip(): ZeroClipboardClient = js.native
    def unclip(elements: Element): ZeroClipboardClient = js.native
    /**
      * Unregister the clipboard actions of previously registered element(s) on the page. If no elements are provided,
      * ALL clipped/registered elements will be unregistered.
      * @param  {Element[]} elements
      * @return {ZeroClipboardClient}
      */
    def unclip(elements: List[Element]): ZeroClipboardClient = js.native
  }
  
  @js.native
  trait ZeroClipboardCommon extends StObject {
    
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
    def emit(data: Name): js.Any = js.native
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
    def handlers(): Beforecopy = js.native
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
    def off(listenerObj: Aftercopy): Unit = js.native
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
    def on(listenerObj: Aftercopy): Unit = js.native
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
  
  @js.native
  trait ZeroClipboardConfig extends StObject {
    
    /**
      * The class used to indicate that a clipped element is active (is being clicked).
      * @type {string}
      */
    var activeClass: js.UndefOr[String] = js.native
    
    /**
      * Setting this to `false` would allow users to handle calling `ZeroClipboard.focus(...);`
      * themselves instead of relying on our per-element `mouseover` handler.
      * @type {boolean}
      */
    var autoActivate: js.UndefOr[Boolean] = js.native
    
    /**
      * Bubble synthetic events in JavaScript after they are received by the Flash object.
      * @type {boolean}
      */
    var bubbleEvents: js.UndefOr[Boolean] = js.native
    
    /**
      * Include a "noCache" query parameter on requests for the SWF.
      * @type {boolean}
      */
    var cacheBust: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the class of the `div` encapsulating the Flash object.
      * @type {string}
      */
    var containerClass: js.UndefOr[String] = js.native
    
    /**
      * Sets the ID of the `div` encapsulating the Flash object.
      * Value is validated against the [HTML4 spec for `ID` tokens][valid_ids].
      * @type {string}
      */
    var containerId: js.UndefOr[String] = js.native
    
    /**
      * Ensure OS-compliant line endings, i.e. "\r\n" on Windows, "\n" elsewhere
      * @type {boolean}
      */
    var fixLineEndings: js.UndefOr[Boolean] = js.native
    
    /**
      * How many milliseconds to wait for the Flash SWF to load and respond before assuming that
      * Flash is deactivated (e.g. click-to-play) in the user's browser. If you don't care about
      * how long it takes to load the SWF, you can set this to `null`.
      * @type {number}
      */
    var flashLoadTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Enable use of the fancy "Desktop" clipboard, even on Linux where it is known to suck.
      * @type {boolean}
      */
    var forceEnhancedClipboard: js.UndefOr[Boolean] = js.native
    
    /**
      * Forcibly set the hand cursor ("pointer") for all clipped elements.
      * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
      * @type {boolean}
      */
    var forceHandCursor: js.UndefOr[Boolean] = js.native
    
    /**
      * The class used to indicate that a clipped element is being hovered over.
      * @type {string}
      */
    var hoverClass: js.UndefOr[String] = js.native
    
    /**
      * Sets the ID and name of the Flash `object` element.
      * Value is validated against the [HTML4 spec for `ID` and `Name` tokens][valid_ids].
      * @type {string}
      */
    var swfObjectId: js.UndefOr[String] = js.native
    
    /**
      * SWF URL, relative to the page. Default value will be "ZeroClipboard.swf" under the same path as the ZeroClipboard JS file.
      * @type {string}
      */
    var swfPath: js.UndefOr[String] = js.native
    
    /**
      * Sets the title of the `div` encapsulating the Flash object.
      * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
      * @type {string}
      */
    var title: js.UndefOr[String] = js.native
    
    /**
      * SWF inbound scripting policy: page domains that the SWF should trust. (single string, or array of strings)
      * @type {SingleOrList<string>}
      */
    var trustedDomains: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The z-index used by the Flash object.
      * Max value (32-bit): 2147483647.
      * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
      * @type {number}
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ZeroClipboardConfig {
    
    @scala.inline
    def apply(): ZeroClipboardConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZeroClipboardConfig]
    }
    
    @scala.inline
    implicit class ZeroClipboardConfigMutableBuilder[Self <: ZeroClipboardConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      @scala.inline
      def setAutoActivate(value: Boolean): Self = StObject.set(x, "autoActivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoActivateUndefined: Self = StObject.set(x, "autoActivate", js.undefined)
      
      @scala.inline
      def setBubbleEvents(value: Boolean): Self = StObject.set(x, "bubbleEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleEventsUndefined: Self = StObject.set(x, "bubbleEvents", js.undefined)
      
      @scala.inline
      def setCacheBust(value: Boolean): Self = StObject.set(x, "cacheBust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheBustUndefined: Self = StObject.set(x, "cacheBust", js.undefined)
      
      @scala.inline
      def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setFixLineEndings(value: Boolean): Self = StObject.set(x, "fixLineEndings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixLineEndingsUndefined: Self = StObject.set(x, "fixLineEndings", js.undefined)
      
      @scala.inline
      def setFlashLoadTimeout(value: Double): Self = StObject.set(x, "flashLoadTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlashLoadTimeoutUndefined: Self = StObject.set(x, "flashLoadTimeout", js.undefined)
      
      @scala.inline
      def setForceEnhancedClipboard(value: Boolean): Self = StObject.set(x, "forceEnhancedClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceEnhancedClipboardUndefined: Self = StObject.set(x, "forceEnhancedClipboard", js.undefined)
      
      @scala.inline
      def setForceHandCursor(value: Boolean): Self = StObject.set(x, "forceHandCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHandCursorUndefined: Self = StObject.set(x, "forceHandCursor", js.undefined)
      
      @scala.inline
      def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
      
      @scala.inline
      def setSwfObjectId(value: String): Self = StObject.set(x, "swfObjectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwfObjectIdUndefined: Self = StObject.set(x, "swfObjectId", js.undefined)
      
      @scala.inline
      def setSwfPath(value: String): Self = StObject.set(x, "swfPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwfPathUndefined: Self = StObject.set(x, "swfPath", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTrustedDomains(value: js.Array[String]): Self = StObject.set(x, "trustedDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustedDomainsUndefined: Self = StObject.set(x, "trustedDomains", js.undefined)
      
      @scala.inline
      def setTrustedDomainsVarargs(value: String*): Self = StObject.set(x, "trustedDomains", js.Array(value :_*))
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait ZeroClipboardCopyEvent extends ZeroClipboardEvent {
    
    var clipboardData: ClearData = js.native
  }
  object ZeroClipboardCopyEvent {
    
    @scala.inline
    def apply(
      clipboardData: ClearData,
      currentTarget: HTMLObjectElement,
      relatedTarget: HTMLElement,
      target: HTMLElement,
      timeStamp: Double,
      `type`: String
    ): ZeroClipboardCopyEvent = {
      val __obj = js.Dynamic.literal(clipboardData = clipboardData.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZeroClipboardCopyEvent]
    }
    
    @scala.inline
    implicit class ZeroClipboardCopyEventMutableBuilder[Self <: ZeroClipboardCopyEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipboardData(value: ClearData): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZeroClipboardDestroyEvent extends ZeroClipboardEvent {
    
    var data: Dictionary[String] = js.native
    
    var success: Dictionary[Boolean] = js.native
  }
  object ZeroClipboardDestroyEvent {
    
    @scala.inline
    def apply(
      currentTarget: HTMLObjectElement,
      data: Dictionary[String],
      relatedTarget: HTMLElement,
      success: Dictionary[Boolean],
      target: HTMLElement,
      timeStamp: Double,
      `type`: String
    ): ZeroClipboardDestroyEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZeroClipboardDestroyEvent]
    }
    
    @scala.inline
    implicit class ZeroClipboardDestroyEventMutableBuilder[Self <: ZeroClipboardDestroyEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Dictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Dictionary[Boolean]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZeroClipboardErrorEvent extends ZeroClipboardEvent {
    
    var actualValue: js.UndefOr[String] = js.native
    
    var configuredValue: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[Dictionary[String]] = js.native
    
    var errors: js.UndefOr[js.Array[_]] = js.native
    
    var jsVersion: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    var minimumVersion: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var swfVersion: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object ZeroClipboardErrorEvent {
    
    @scala.inline
    def apply(
      currentTarget: HTMLObjectElement,
      message: String,
      name: String,
      relatedTarget: HTMLElement,
      target: HTMLElement,
      timeStamp: Double,
      `type`: String
    ): ZeroClipboardErrorEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZeroClipboardErrorEvent]
    }
    
    @scala.inline
    implicit class ZeroClipboardErrorEventMutableBuilder[Self <: ZeroClipboardErrorEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualValue(value: String): Self = StObject.set(x, "actualValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualValueUndefined: Self = StObject.set(x, "actualValue", js.undefined)
      
      @scala.inline
      def setConfiguredValue(value: String): Self = StObject.set(x, "configuredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfiguredValueUndefined: Self = StObject.set(x, "configuredValue", js.undefined)
      
      @scala.inline
      def setData(value: Dictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setJsVersion(value: String): Self = StObject.set(x, "jsVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsVersionUndefined: Self = StObject.set(x, "jsVersion", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setSwfVersion(value: String): Self = StObject.set(x, "swfVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwfVersionUndefined: Self = StObject.set(x, "swfVersion", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait ZeroClipboardEvent extends StObject {
    
    var client: js.UndefOr[ZeroClipboardClient] = js.native
    
    var currentTarget: HTMLObjectElement = js.native
    
    var relatedTarget: HTMLElement = js.native
    
    var target: HTMLElement = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
  }
  object ZeroClipboardEvent {
    
    @scala.inline
    def apply(
      currentTarget: HTMLObjectElement,
      relatedTarget: HTMLElement,
      target: HTMLElement,
      timeStamp: Double,
      `type`: String
    ): ZeroClipboardEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZeroClipboardEvent]
    }
    
    @scala.inline
    implicit class ZeroClipboardEventMutableBuilder[Self <: ZeroClipboardEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: ZeroClipboardClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: HTMLObjectElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTarget(value: HTMLElement): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZeroClipboardReadyEvent extends ZeroClipboardEvent {
    
    var message: String = js.native
    
    var version: String = js.native
  }
  object ZeroClipboardReadyEvent {
    
    @scala.inline
    def apply(
      currentTarget: HTMLObjectElement,
      message: String,
      relatedTarget: HTMLElement,
      target: HTMLElement,
      timeStamp: Double,
      `type`: String,
      version: String
    ): ZeroClipboardReadyEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZeroClipboardReadyEvent]
    }
    
    @scala.inline
    implicit class ZeroClipboardReadyEventMutableBuilder[Self <: ZeroClipboardReadyEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZeroClipboardStatic
    extends ZeroClipboardCommon
       with Instantiable0[ZeroClipboardClient]
       with Instantiable1[(/* elements */ Element) | (/* elements */ List[Element]), ZeroClipboardClient] {
    
    /**
      * Focus/"activate" the provided element by moving the Flash SWF object in front of it.
      * @param {Element} element
      * @deprecated: The preferred method to use is focus but the alias activate is available for backward compatibility's sake.
      */
    def activate(element: Element): Unit = js.native
    
    /**
      * Return the currently "activated" element that the Flash SWF object is in front of it.
      * @return {HTMLElement} or {null}
      */
    def activeElement(): HTMLElement = js.native
    
    /**
      * Blur/"deactivate" the currently focused/"activated" element, moving the Flash SWF object off the screen.
      * @since 2.1.0
      */
    def blur(): Unit = js.native
    
    /**
      * Get a copy of the active configuration for ZeroClipboard.
      * @return {ZeroClipboardConfig}
      */
    def config(): ZeroClipboardConfig = js.native
    /**
      * Set the active configuration for ZeroClipboard. Returns a copy of the updated active configuration.
      * @param  {ZeroClipboardConfig} config
      * @return {ZeroClipboardConfig}
      */
    def config(config: ZeroClipboardConfig): ZeroClipboardConfig = js.native
    /**
      *  Get a copy of the actively configured value for this configuration property for ZeroClipboard.
      * @param  {string} propName
      * @return {any}
      */
    def config(propName: String): js.Any = js.native
    @JSName("config")
    def config_activeClass(propName: activeClass): String = js.native
    @JSName("config")
    def config_autoActivate(propName: autoActivate): Boolean = js.native
    @JSName("config")
    def config_bubbleEvents(propName: bubbleEvents): Boolean = js.native
    @JSName("config")
    def config_cacheBust(propName: cacheBust): Boolean = js.native
    @JSName("config")
    def config_containerClass(propName: containerClass): String = js.native
    @JSName("config")
    def config_containerId(propName: containerId): String = js.native
    @JSName("config")
    def config_fixLineEndings(propName: fixLineEndings): Boolean = js.native
    @JSName("config")
    def config_flashLoadTimeout(propName: flashLoadTimeout): Double = js.native
    @JSName("config")
    def config_forceEnhancedClipboard(propName: forceEnhancedClipboard): Boolean = js.native
    @JSName("config")
    def config_forceHandCursor(propName: forceHandCursor): Boolean = js.native
    @JSName("config")
    def config_hoverClass(propName: hoverClass): String = js.native
    @JSName("config")
    def config_swfObjectId(propName: swfObjectId): String = js.native
    @JSName("config")
    def config_swfPath(propName: swfPath): String = js.native
    @JSName("config")
    def config_title(propName: title): String = js.native
    @JSName("config")
    def config_trustedDomains(propName: trustedDomains): js.Array[String] = js.native
    @JSName("config")
    def config_zIndex(propName: zIndex): Double = js.native
    
    /**
      * Create the Flash bridge SWF object.
      * IMPORTANT: This method should be considered private.
      * @private
      */
    def create(): Unit = js.native
    
    /**
      * Blur/"deactivate" the currently focused/"activated" element, moving the Flash SWF object off the screen.
      * @deprecated: The preferred method to use is blur but the alias deactivate is available for backward compatibility's sake.
      */
    def deactivate(): Unit = js.native
    
    /**
      * Emit the "destroy" event, remove all event handlers, and destroy the Flash bridge.
      */
    def destroy(): Unit = js.native
    
    /**
      * Focus/"activate" the provided element by moving the Flash SWF object in front of it.
      * @param {Element} element
      * @since 2.1.0
      */
    def focus(element: Element): Unit = js.native
    
    /**
      * Indicates if Flash Player is definitely unusable (disabled, outdated, unavailable, or deactivated).
      * IMPORTANT: This method should be considered private.
      * @return {boolean}
      * @private
      */
    def isFlashUnusable(): Boolean = js.native
    
    /**
      * Diagnostic method that describes the state of the browser, Flash Player, and ZeroClipboard.
      * @return {Object}
      */
    def state(): js.Object = js.native
    
    /**
      * The version of the ZeroClipboard library being used, e.g. "2.0.0".
      * @type {string}
      */
    var version: String = js.native
  }
}
