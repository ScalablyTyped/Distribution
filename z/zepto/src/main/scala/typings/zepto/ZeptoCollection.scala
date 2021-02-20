package typings.zepto

import typings.std.Element
import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZeptoCollection extends StObject {
  
  /**
    * Core
    **/
  /**
    * Modify the current collection by adding the results of performing the CSS selector on the whole document, or, if context is given, just inside context elements.
    * @param selector
    * @param context
    * @return Self object.
    **/
  def add(selector: String): ZeptoCollection = js.native
  def add(selector: String, context: js.Any): ZeptoCollection = js.native
  
  /**
    * Add class name to each of the elements in the collection. Multiple class names can be given in a space-separated string.
    * @param name
    * @return Self object.
    **/
  def addClass(name: String): ZeptoCollection = js.native
  
  /**
    * Add content to the DOM after each elements in the collection. The content can be an HTML string, a DOM node or an array of nodes.
    * @param content
    * @return Self object.
    **/
  def after(content: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.after
    **/
  def after(content: js.Array[HTMLElement]): ZeptoCollection = js.native
  /*
    * @see ZeptoCollection.after
    **/
  def after(content: HTMLElement): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.after
    **/
  def after(content: ZeptoCollection): ZeptoCollection = js.native
  
  /**
    * Effects
    **/
  /**
    * Smoothly transition CSS properties of elements in the current collection.
    * @param properties object that holds CSS values to animate to; or CSS keyframe animation name.
    *    Zepto also supports the following CSS transform porperties:
    *        translate(X|Y|Z|3d)
    *        rotate(X|Y|Z|3d)
    *        scale(X|Y|Z)
    *        matrix(3d)
    *        perspective
    *        skew(X|Y)
    * @param duration (default 400): duration in milliseconds, or a string:
    *        fast (200 ms)
    *        slow (600 ms)
    *        any custom property of $.fx.speeds
    * @param easing (default linear): specifies the type of animation easing to use, one of:
    *        ease
    *        linear
    *        ease-in
    *        ease-out
    *        ease-in-out
    *        cubic-bezier(x1, y1, x2, y2)
    * @param complete Callback function when the animation has completed.
    * @return Self object.
    * @note If the duration is 0 or $.fx.off is true (default in a browser that doesn’t support CSS transitions), animations will not be executed; instead the target values will take effect instantly. Similarly, when the target CSS properties match the current state of the element, there will be no animation and the complete function won’t be called.
    *    If the first argument is a string instead of object, it is taken as a CSS keyframe animation name.
    * @note Zepto exclusively uses CSS transitions for effects and animation. jQuery easings are not supported. jQuery's syntax for relative changes ("=+10px") is not supported. See the spec for a list of animatable properties (http://www.w3.org/TR/css3-transitions/#animatable-properties-). Browser support may vary, so be sure to test in all browsers you want to support.
    **/
  def animate(properties: js.Any): ZeptoCollection = js.native
  def animate(
    properties: js.Any,
    duration: js.UndefOr[scala.Nothing],
    easing: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): ZeptoCollection = js.native
  def animate(properties: js.Any, duration: js.UndefOr[scala.Nothing], easing: String): ZeptoCollection = js.native
  def animate(
    properties: js.Any,
    duration: js.UndefOr[scala.Nothing],
    easing: String,
    complete: js.Function0[Unit]
  ): ZeptoCollection = js.native
  def animate(properties: js.Any, duration: Double): ZeptoCollection = js.native
  def animate(
    properties: js.Any,
    duration: Double,
    easing: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): ZeptoCollection = js.native
  def animate(properties: js.Any, duration: Double, easing: String): ZeptoCollection = js.native
  def animate(properties: js.Any, duration: Double, easing: String, complete: js.Function0[Unit]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.animate
    * @param options Animation options.
    **/
  def animate(properties: js.Any, options: ZeptoAnimateSettings): ZeptoCollection = js.native
  
  /**
    * Append content to the DOM inside each individual element in the collection. The content can be an HTML string, a DOM node or an array of nodes.
    * @param content
    * @return Self object.
    **/
  def append(content: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.append
    **/
  def append(content: js.Array[HTMLElement]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.append
    **/
  def append(content: HTMLElement): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.append
    **/
  def append(content: ZeptoCollection): ZeptoCollection = js.native
  
  /**
    * Append elements from the current collection to the target element. This is like append, but with reversed operands.
    * @param target
    * @return Self object.
    **/
  def appendTo(target: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.appendTo
    **/
  def appendTo(target: js.Array[HTMLElement]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.appendTo
    **/
  def appendTo(target: HTMLElement): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.appendTo
    **/
  def appendTo(target: ZeptoCollection): ZeptoCollection = js.native
  
  /**
    * Read or set DOM attributes. When no value is given, reads specified attribute from the first element in the collection. When value is given, sets the attribute to that value on each element in the collection. When value is null, the attribute is removed (like with removeAttr). Multiple attributes can be set by passing an object with name-value pairs.
    * To read DOM properties such as checked or selected, use prop.
    * @param name
    * @return
    **/
  def attr(name: String): String = js.native
  /**
    * @see ZeptoCollection.attr
    * @param fn
    * @param oldValue
    **/
  def attr(name: String, fn: js.Function2[/* index */ Double, /* oldValue */ js.Any, Unit]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.attr
    * @param value
    **/
  def attr(name: String, value: js.Any): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.attr
    * @param object
    **/
  def attr(`object`: js.Any): ZeptoCollection = js.native
  
  /**
    * Add content to the DOM before each element in the collection. The content can be an HTML string, a DOM node or an array of nodes.
    * @param content
    * @return Self object.
    **/
  def before(content: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.before
    **/
  def before(content: js.Array[HTMLElement]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.before
    **/
  def before(content: HTMLElement): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.before
    **/
  def before(content: ZeptoCollection): ZeptoCollection = js.native
  
  /**
    * Event
    **/
  /**
    * Attach an event handler to elements.
    * @deprecated use ZeptoCollection.on instead.
    * @param type
    * @param fn
    * @return
    **/
  def bind(`type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def blur(): ZeptoCollection = js.native
  def blur(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def change(): ZeptoCollection = js.native
  def change(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Get immediate children of each element in the current collection. If selector is given, filter the results to only include ones matching the CSS selector.
    * @param selector
    * @return Children elements.
    **/
  def children(): ZeptoCollection = js.native
  def children(selector: String): ZeptoCollection = js.native
  
  def click(): ZeptoCollection = js.native
  def click(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Traverse upwards from the current element to find the first element that matches the selector. If context node is given, consider only elements that are its descendants. This method is similar to parents(selector), but it only returns the first ancestor matched.
    * If a Zepto collection or element is given, the resulting element will have to match one of the given elements instead of a selector.
    * @param selector
    * @param context
    * @return Closest element from the selector and context.
    **/
  def closest(selector: String): ZeptoCollection = js.native
  def closest(selector: String, context: js.Any): ZeptoCollection = js.native
  
  /**
    * Modify the collection by adding elements to it. If any of the arguments is an array, its elements are merged into the current collection.
    * (!) This is a Zepto-provided method that is not part of the jQuery API.
    * @param nodes
    * @return Self object.
    **/
  def concat(nodes: js.Any*): ZeptoCollection = js.native
  
  /**
    * Get the children of each element in the collection, including text and comment nodes.
    * @return Children including text and comment nodes.
    **/
  def contents(): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.css
    * @param properties
    **/
  def css(properties: js.Any): ZeptoCollection = js.native
  /**
    * Read or set CSS properties on DOM elements. When no value is given, returns the CSS property from the first element in the collection. When a value is given, sets the property to that value on each element of the collection. Multiple properties can be set by passing an object to the method.
    * When a value for a property is blank (empty string, null, or undefined), that property is removed. When a unitless number value is given, “px” is appended to it for properties that require units.
    * @param property
    * @return
    **/
  def css(property: String): js.Any = js.native
  /**
    * @see ZeptoCollection.css
    * @param value
    **/
  def css(property: String, value: js.Any): ZeptoCollection = js.native
  
  /**
    * Read or write data-* DOM attributes. Behaves like attr, but prepends data- to the attribute name.
    * When reading attribute values, the following conversions apply:
    *    “true”, “false”, and “null” are converted to corresponding types;
    *    number values are converted to actual numeric types;
    *    JSON values are parsed, if it’s valid JSON;
    *    everything else is returned as string.
    * (!)  Zepto's basic implementation of `data()` only stores strings. To store arbitrary objects, include the optional "data" module in your custom build of Zepto.
    * @param name
    * @return
    **/
  def data(name: String): js.Any = js.native
  /**
    * @see ZeptoCollection.data
    * @param value
    **/
  def data(name: String, value: js.Any): ZeptoCollection = js.native
  
  def dblclick(): ZeptoCollection = js.native
  def dblclick(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Attach an event handler that is only triggered when the event originated from a node that matches a selector.
    * @depcreated use ZeptoCollection.on instead.
    * @param selector
    * @param type
    * @param fn
    * @return
    **/
  def delegate(selector: String, `type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Detach event handler added by live.
    * @deprecated use ZeptoCollection.off instead.
    * @param type
    * @param fn
    * @return
    **/
  def die(`type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.die
    * @deprecated use ZeptoCollection.off instead.
    * @param types
    **/
  def die(types: js.Any): ZeptoCollection = js.native
  
  /**
    * Iterate through every element of the collection. Inside the iterator function, this keyword refers to the current item (also passed as the second argument to the function). If the iterator function returns false, iteration stops.
    * @param fn
    * @param item
    * @return Self object.
    **/
  def each(fn: js.Function2[/* index */ Double, /* item */ js.Any, Boolean]): ZeptoCollection = js.native
  
  /**
    * Clear DOM contents of each element in the collection.
    * @return Self object.
    **/
  def empty(): ZeptoCollection = js.native
  
  /**
    * Get the item at position specified by index from the current collection.
    * @param index
    * @return Item specified by index in this collection.
    **/
  def eq(index: Double): ZeptoCollection = js.native
  
  def error(): ZeptoCollection = js.native
  def error(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.filter
    * @param fn
    **/
  def filter(fn: js.Function1[/* index */ Double, Boolean]): ZeptoCollection = js.native
  /**
    * Filter the collection to contain only items that match the CSS selector. If a function is given, return only elements for which the function returns a truthy value. Inside the function, the this keyword refers to the current element.
    * For the opposite, see not.
    * @param selector
    * @return Filtered collection.
    **/
  def filter(selector: String): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.find
    * @param collection
    **/
  def find(collection: ZeptoCollection): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.find
    * @param element
    **/
  def find(element: Element): ZeptoCollection = js.native
  /**
    * Find elements that match CSS selector executed in scope of nodes in the current collection.
    * If a Zepto collection or element is given, filter those elements down to only ones that are descendants of element in the current collection.
    * @param selector
    * @return Found items.
    **/
  def find(selector: String): ZeptoCollection = js.native
  
  /**
    * Get the first element of the current collection.
    * @return First element in the current collection.
    **/
  def first(): ZeptoCollection = js.native
  
  def focus(): ZeptoCollection = js.native
  def focus(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def focusin(): ZeptoCollection = js.native
  def focusin(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def focusout(): ZeptoCollection = js.native
  def focusout(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Iterate through every element of the collection. Similar to each, but the arguments for the iterator functions are different, and returning false from the iterator won’t stop the iteration.
    * (!) This is a Zepto-provided method that is not part of the jQuery API.
    * @param fn
    * @return
    **/
  def forEach(fn: js.Function3[/* item */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit]): ZeptoCollection = js.native
  
  /**
    * Get all elements or a single element from the current collection. When no index is given, returns all elements in an ordinary array. When index is specified, return only the element at that position. This is different than eq in the way that the returned node is not wrapped in a Zepto collection.
    * @return
    **/
  def get(): js.Array[HTMLElement] = js.native
  /**
    * @see ZeptoCollection.get
    * @param index
    **/
  def get(index: Double): HTMLElement = js.native
  
  /**
    * @see ZeptoCollection.has
    * @param node
    **/
  def has(node: HTMLElement): ZeptoCollection = js.native
  /**
    * Filter the current collection to include only elements that have any number of descendants that match a selector, or that contain a specific DOM node.
    * @param selector
    * @return
    **/
  def has(selector: String): ZeptoCollection = js.native
  
  /**
    * Check if any elements in the collection have the specified class.
    * @param name
    * @return
    **/
  def hasClass(name: String): Boolean = js.native
  
  /**
    * Get the height of the first element in the collection; or set the height of all elements in the collection.
    * @return
    **/
  def height(): Double = js.native
  /**
    * @see ZeptoCollection.height
    * @param fn
    **/
  def height(fn: js.Function2[/* index */ Double, /* oldHeight */ Double, Unit]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.height
    * @param value
    **/
  def height(value: Double): ZeptoCollection = js.native
  
  /**
    * Hide elements in this collection by setting their display CSS property to none.
    * @return
    **/
  def hide(): ZeptoCollection = js.native
  
  /**
    * Get or set HTML contents of elements in the collection. When no content given, returns innerHTML of the first element. When content is given, use it to replace contents of each element. Content can be any of the types described in append.
    * @return
    **/
  def html(): String = js.native
  /**
    * @see ZeptoCollection.html
    * @param content
    **/
  def html(content: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.html
    * @param content
    **/
  def html(content: js.Array[HTMLElement]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.html
    * @param content
    **/
  def html(content: HTMLElement): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.html
    * @param fn
    **/
  def html(fn: js.Function2[/* index */ Double, /* oldHtml */ String, Unit]): ZeptoCollection = js.native
  
  /**
    * Get the position of an element. When no element is given, returns position of the current element among its siblings. When an element is given, returns its position in the current collection. Returns -1 if not found.
    * @param element
    * @return
    **/
  def index(): Double = js.native
  def index(element: String): Double = js.native
  def index(element: js.Any): Double = js.native
  def index(element: HTMLElement): Double = js.native
  
  // not sure so leaving in for now
  /**
    * Get the position of an element in the current collection. If fromIndex number is given, search only from that position onwards. Returns the 0-based position when found and -1 if not found. Use of index is recommended over this method.
    * (!) This is a Zepto-provided method that is not part of the jQuery API.
    * @see ZeptoCollection.index
    * @param element
    * @param fromIndex
    * @return
    **/
  def indexOf(element: String): Double = js.native
  def indexOf(element: String, fromIndex: Double): Double = js.native
  /**
    * @see ZeptoCollection.indexOf
    * @param element
    **/
  def indexOf(element: js.Any): Double = js.native
  def indexOf(element: js.Any, fromIndex: Double): Double = js.native
  /**
    * @see ZeptoCollection.indexOf
    * @param element
    **/
  def indexOf(element: HTMLElement): Double = js.native
  def indexOf(element: HTMLElement, fromIndex: Double): Double = js.native
  
  // not sure so leaving in for now
  /**
    * Insert elements from the current collection after the target element in the DOM. This is like after, but with reversed operands.
    * @param target
    * @return
    **/
  def insertAfter(target: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.insertAfter
    * @param target
    **/
  def insertAfter(target: HTMLElement): ZeptoCollection = js.native
  
  /**
    * Insert elements from the current collection before each of the target elements in the DOM. This is like before, but with reversed operands.
    * @param target
    * @return
    **/
  def insertBefore(target: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.insertBefore
    * @param target
    **/
  def insertBefore(target: HTMLElement): ZeptoCollection = js.native
  
  /**
    * Check if the first element of the current collection matches the CSS selector. For basic support of jQuery’s non-standard pseudo-selectors such as :visible, include the optional “selector” module.
    * (!) jQuery CSS extensions are not supported. The optional "selector" module only provides limited support for few of the most used ones.
    * @param selector
    * @return
    **/
  def is(): Boolean = js.native
  def is(selector: String): Boolean = js.native
  
  def keydown(): ZeptoCollection = js.native
  def keydown(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def keypress(): ZeptoCollection = js.native
  def keypress(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def keyup(): ZeptoCollection = js.native
  def keyup(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Get the last element of the current collection.
    * @return
    **/
  def last(): ZeptoCollection = js.native
  
  /**
    * Get the number of elements in this collection.
    **/
  var length: Double = js.native
  
  /**
    * Like delegate where the selector is taken from the current collection.
    * @deprepcated use ZeptoCollection.on instead.
    * @param type
    * @param fn
    * @return
    **/
  def live(`type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def load(): ZeptoCollection = js.native
  def load(fn: ZeptoEventHandler): ZeptoCollection = js.native
  /**
    * Ajax
    **/
  /**
    * Set the html contents of the current collection to the result of a GET Ajax call to the given URL. Optionally, a CSS selector can be specified in the URL, like so, to use only the HTML content matching the selector for updating the collection:
    * $('#some_element').load('/foo.html #bar')
    * If no CSS selector is given, the complete response text is used instead.
    * Note that any JavaScript blocks found are only executed in case no selector is given.
    * @param url URL to send the HTTP GET request to.
    * @param fn Callback function when the HTTP GET request is completed.
    * @return Self object.
    * @example
    *    $('#some_element').load('/foo.html #bar')
    **/
  def load(url: String): ZeptoCollection = js.native
  def load(
    url: String,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ): ZeptoCollection = js.native
  
  /**
    * Iterate through all elements and collect the return values of the iterator function. Inside the iterator function, this keyword refers to the current item (also passed as the second argument to the function).
    * Returns a collection of results of iterator function, with null and undefined values filtered out.
    * @param fn
    * @return
    **/
  def map(fn: js.Function2[/* index */ Double, /* item */ js.Any, _]): ZeptoCollection = js.native
  
  def mousedown(): ZeptoCollection = js.native
  def mousedown(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def mouseenter(): ZeptoCollection = js.native
  def mouseenter(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def mouseleave(): ZeptoCollection = js.native
  def mouseleave(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def mousemove(): ZeptoCollection = js.native
  def mousemove(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def mouseout(): ZeptoCollection = js.native
  def mouseout(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def mouseover(): ZeptoCollection = js.native
  def mouseover(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def mouseup(): ZeptoCollection = js.native
  def mouseup(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Get the next sibling—optinally filtered by selector—of each element in the collection.
    * @param selector
    * @return
    **/
  def next(): ZeptoCollection = js.native
  def next(selector: String): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.not
    * @param collection
    **/
  def not(collection: ZeptoCollection): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.not
    * @param fn
    **/
  def not(fn: js.Function1[/* index */ Double, Boolean]): ZeptoCollection = js.native
  /**
    * Filter the current collection to get a new collection of elements that don’t match the CSS selector. If another collection is given instead of selector, return only elements not present in it. If a function is given, return only elements for which the function returns a falsy value. Inside the function, the this keyword refers to the current element.
    * For the opposite, see filter.
    * @param selector
    * @return
    **/
  def not(selector: String): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.off
    **/
  def off(): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.off
    * @param events
    **/
  def off(events: ZeptoEventHandlers): ZeptoCollection = js.native
  def off(events: ZeptoEventHandlers, selector: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.off
    **/
  def off(`type`: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.off
    **/
  def off(`type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  def off(`type`: String, selector: String): ZeptoCollection = js.native
  /**
    * Detach event handlers added with on. To detach a specific event handler, the same function must be passed that was used for on(). Otherwise, just calling this method with an event type with detach all handlers of that type. When called without arguments, it detaches all event handlers registered on current elements.
    * @param type
    * @param selector
    * @param fn
    * @return
    **/
  def off(`type`: String, selector: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Get position of the element in the document. Returns an object with properties: top, left, width and height.
    * When given an object with properties left and top, use those values to position each element in the collection relative to the document.
    * @return
    **/
  def offset(): ZeptoCoordinates = js.native
  /**
    * @see ZeptoCollection.offset
    * @param coordinates
    **/
  def offset(coordinates: ZeptoCoordinates): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.offset
    * @param fn
    **/
  def offset(fn: js.Function2[/* index */ Double, /* oldOffset */ Double, Unit]): ZeptoCollection = js.native
  
  /**
    * Find the first ancestor element that is positioned, meaning its CSS position value is “relative”, “absolute” or “fixed”.
    * @return
    **/
  def offsetParent(): ZeptoCollection = js.native
  
  // todo: v0.9 will introduce string literals
  //on(type: 'ajaxStart', fn: ZeptoAjaxStartEvent): ZeptoCollection;
  //on(type: 'ajaxBeforeSend', fn: ZeptoAjaxBeforeSendEvent): ZeptoCollection;
  //on(type: 'ajaxSend', fn: ZeptoAjaxSendEvent): ZeptoCollection;
  //on(type: 'ajaxSuccess', fn: ZeptoAjaxSuccessEvent): ZeptoCollection;
  //on(type: 'ajaxError', fn: ZeptoAjaxErrorEvent): ZeptoCollection;
  //on(type: 'ajaxComplete', fn: ZeptoAjaxCompleteEvent): ZeptoCollection;
  //on(type: 'ajaxStop', fn: ZeptoAjaxStopEvent): ZeptoCollection;
  /**
    * @see ZeptoCollection.on
    * @param events
    **/
  def on(events: ZeptoEventHandlers): ZeptoCollection = js.native
  def on(events: ZeptoEventHandlers, selector: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.on
    **/
  def on(`type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  /**
    * Add event handlers to the elements in collection. Multiple event types can be passed in a space-separated string, or as an object where event types are keys and handlers are values. If a CSS selector is given, the handler function will only be called when an event originates from an element that matches the selector.
    * Event handlers are executed in the context of the element to which the handler is attached, or the matching element in case a selector is provided. When an event handler returns false, preventDefault() is called for the current event, preventing the default browser action such as following links.
    * @param type
    * @param selector
    * @param fn
    * @return
    **/
  def on(`type`: String, selector: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.one
    * @param events
    **/
  def one(events: ZeptoEventHandlers): ZeptoCollection = js.native
  /**
    * Adds an event handler that removes itself the first time it runs, ensuring that the handler only fires once.
    * @param type
    * @param fn
    * @return
    **/
  def one(`type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Get immediate parents of each element in the collection. If CSS selector is given, filter results to include only ones matching the selector.
    * @param selector
    * @return
    **/
  def parent(): ZeptoCollection = js.native
  def parent(selector: String): ZeptoCollection = js.native
  
  /**
    * Get all ancestors of each element in the collection. If CSS selector is given, filter results to include only ones matching the selector.
    * To get only immediate parents, use parent. To only get the first ancestor that matches the selector, use closest.
    * @param selector
    * @return
    **/
  def parents(): ZeptoCollection = js.native
  def parents(selector: String): ZeptoCollection = js.native
  
  /**
    * Get values from a named property of each element in the collection, with null and undefined values filtered out.
    * (!) This is a Zepto-provided method that is not part of the jQuery API.
    * @param property
    * @return
    **/
  def pluck(property: String): js.Array[String] = js.native
  
  /**
    * Get the position of the first element in the collection, relative to the offsetParent. This information is useful when absolutely positioning an element to appear aligned with another.
    * Returns an object with properties: top, left.
    * @return
    **/
  def position(): ZeptoPosition = js.native
  
  /**
    * Prepend content to the DOM inside each element in the collection. The content can be an HTML string, a DOM node or an array of nodes.
    * @param content
    * @return
    **/
  def prepend(content: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.prepend
    * @param content
    **/
  def prepend(content: js.Array[HTMLElement]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.prepend
    * @param content
    **/
  def prepend(content: HTMLElement): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.prepend
    * @param content
    **/
  def prepend(content: ZeptoCollection): ZeptoCollection = js.native
  
  /**
    * Prepend elements of the current collection inside each of the target elements. This is like prepend, only with reversed operands.
    * @param content
    * @return
    **/
  def prependTo(content: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.prependTo
    * @param content
    **/
  def prependTo(content: js.Array[HTMLElement]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.prependTo
    * @param content
    **/
  def prependTo(content: HTMLElement): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.prependTo
    * @param content
    **/
  def prependTo(content: ZeptoCollection): ZeptoCollection = js.native
  
  /**
    * Get the previous sibling—optionally filtered by selector—of each element in the collection.
    * @param selector
    * @return
    **/
  def prev(): ZeptoCollection = js.native
  def prev(selector: String): ZeptoCollection = js.native
  
  /**
    * Read or set properties of DOM elements. This should be preferred over attr in case of reading values of properties that change with user interaction over time, such as checked and selected.
    * @param prop
    * @return
    **/
  def prop(name: String): js.Any = js.native
  /**
    * @see ZeptoCollection.Prop
    * @param fn
    **/
  def prop(name: String, fn: js.Function2[/* index */ Double, /* oldValue */ js.Any, Unit]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.Prop
    * @param value
    **/
  def prop(name: String, value: js.Any): ZeptoCollection = js.native
  
  /**
    * Add elements to the end of the current collection.
    * (!) This is a Zepto-provided method that is not part of the jQuery API.
    * @param elements
    * @return
    **/
  def push(elements: js.Any*): ZeptoCollection = js.native
  
  /**
    * Attach an event handler for the “DOMContentLoaded” event that fires when the DOM on the page is ready. It’s recommended to use the $() function instead of this method.
    * @param fn
    * @return
    **/
  def ready(fn: js.Function1[/* $ */ ZeptoStatic, Unit]): ZeptoCollection = js.native
  
  /**
    * Identical to Array.reduce that iterates over current collection.
    * (!) This is a Zepto-provided method that is not part of the jQuery API.
    * @param fn
    * @return
    **/
  def reduce(
    fn: js.Function5[
      /* memo */ js.Any, 
      /* item */ js.Any, 
      /* index */ Double, 
      /* array */ js.Array[_], 
      /* initial */ js.Any, 
      _
    ]
  ): js.Any = js.native
  
  /**
    * Remove elements in the current collection from their parent nodes, effectively detaching them from the DOM.
    * @return
    **/
  def remove(): ZeptoCollection = js.native
  
  /**
    * Remove the specified attribute from all elements in the collection.
    * @param name
    * @return
    **/
  def removeAttr(name: String): ZeptoCollection = js.native
  
  /**
    * Remove the specified class name from all elements in the collection. When the class name isn’t given, remove all class names. Multiple class names can be given in a space-separated string.
    * @param name
    * @return
    **/
  def removeClass(): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.removeClass
    * @param fn
    **/
  def removeClass(fn: js.Function2[/* index */ Double, /* oldClassName */ String, Unit]): ZeptoCollection = js.native
  def removeClass(name: String): ZeptoCollection = js.native
  
  /**
    * Replace each element in the collection—both its contents and the element itself—with the new content. Content can be of any type described in before.
    * @param content
    * @return
    **/
  def replaceWith(content: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.replacewith
    * @param content
    **/
  def replaceWith(content: js.Array[HTMLElement]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.replacewith
    * @param content
    **/
  def replaceWith(content: HTMLElement): ZeptoCollection = js.native
  
  def resize(): ZeptoCollection = js.native
  def resize(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def scroll(): ZeptoCollection = js.native
  def scroll(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Gets the value of how many pixels were scrolled so far on window or scrollable element on the page.
    * @return
    **/
  def scrollTop(): Double = js.native
  
  def select(): ZeptoCollection = js.native
  def select(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Form
    **/
  /**
    * Serialize form values to an URL-encoded string for use in Ajax post requests.
    * @return Seralized form values in URL-encoded string.
    **/
  def serialize(): String = js.native
  
  /**
    * Serialize form into an array of objects with name and value properties. Disabled form controls, buttons, and unchecked radio buttons/checkboxes are skipped. The result doesn’t include data from file inputs.
    * @return Array with name value pairs from the Form.
    **/
  def serializeArray(): js.Array[_] = js.native
  
  /**
    * Restore the default value for the “display” property of each element in the array, effectively showing them if they were hidden with hide.
    * @return
    **/
  def show(): ZeptoCollection = js.native
  
  /**
    * Get all sibling nodes of each element in the collection. If CSS selector is specified, filter the results to contain only elements that match the selector.
    * @param selector
    * @return
    **/
  def siblings(): ZeptoCollection = js.native
  def siblings(selector: String): ZeptoCollection = js.native
  
  /**
    * Get the number of elements in this collection.
    * @return
    **/
  def size(): Double = js.native
  
  /**
    * Extract the subset of this array, starting at start index. If end is specified, extract up to but not including end index.
    * @param start
    * @param end
    * @return
    **/
  def slice(): js.Array[ZeptoCollection] = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[ZeptoCollection] = js.native
  def slice(start: Double): js.Array[ZeptoCollection] = js.native
  def slice(start: Double, end: Double): js.Array[ZeptoCollection] = js.native
  
  /**
    * Trigger or attach a handler for the submit event. When no function given, trigger the “submit” event on the current form and have it perform its submit action unless preventDefault() was called for the event.
    * When a function is given, this simply attaches it as a handler for the “submit” event on current elements.
    * @return Self object.
    **/
  def submit(): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.submit
    * @param fn Handler for the 'submit' event on current elements.
    * @return Self object.
    **/
  def submit(fn: js.Function1[/* e */ js.Any, Unit]): ZeptoCollection = js.native
  
  /**
    * Get or set the text content of elements in the collection. When no content is given, returns the text content of the first element in the collection. When content is given, uses it to replace the text contents of each element in the collection. This is similar to html, with the exception it can’t be used for getting or setting HTML.
    * @return
    **/
  def text(): String = js.native
  /**
    * @see ZeptoCollection.text
    * @param content
    * @return
    **/
  def text(content: String): ZeptoCollection = js.native
  
  /**
    * Toggle between showing and hiding each of the elements, based on whether the first element is visible or not. If setting is present, this method behaves like show if setting is truthy or hide otherwise.
    * @param setting
    * @return
    **/
  def toggle(): ZeptoCollection = js.native
  def toggle(setting: Boolean): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.toggleClass
    * @param fn
    **/
  def toggleClass(fn: js.Function2[/* index */ Double, /* oldClassNames */ String, Unit]): ZeptoCollection = js.native
  def toggleClass(fn: js.Function2[/* index */ Double, /* oldClassNames */ String, Unit], setting: Boolean): ZeptoCollection = js.native
  /**
    * Toggle given class names (space-separated) in each element in the collection. The class name is removed if present on an element; otherwise it’s added. If setting is present, this method behaves like addClass if setting is truthy or removeClass otherwise.
    * @param names
    * @param setting
    * @return
    **/
  def toggleClass(names: String): ZeptoCollection = js.native
  def toggleClass(names: String, setting: Boolean): ZeptoCollection = js.native
  
  /**
    * Trigger the specified event on elements of the collection. Event can either be a string type, or a full event object obtained with $.Event. If a data array is given, it is passed as additional arguments to event handlers.
    * (!) Zepto only supports triggering events on DOM elements.
    * @param event
    * @param data
    * @return
    **/
  def trigger(event: String): ZeptoCollection = js.native
  def trigger(event: String, data: js.Array[_]): ZeptoCollection = js.native
  
  /**
    * Like trigger, but triggers only event handlers on current elements and doesn’t bubble.
    * @param event
    * @param data
    * @return
    **/
  def triggerHandler(event: String): ZeptoCollection = js.native
  def triggerHandler(event: String, data: js.Array[_]): ZeptoCollection = js.native
  
  /**
    * Detach event handler added with bind.
    * @deprecated use ZeptoCollection.off instead.
    * @param type
    * @param fn
    * @return
    **/
  def unbind(`type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Detach event handler added with delegate.
    * @deprecated use ZeptoCollection.off instead.
    * @param selector
    * @param type
    * @param fn
    * @return
    **/
  def undelegate(selector: String, `type`: String, fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  def unload(): ZeptoCollection = js.native
  def unload(fn: ZeptoEventHandler): ZeptoCollection = js.native
  
  /**
    * Remove immediate parent nodes of each element in the collection and put their children in their place. Basically, this method removes one level of ancestry while keeping current elements in the DOM.
    * @return
    **/
  def unwrap(): ZeptoCollection = js.native
  
  /**
    * Get or set the value of form controls. When no value is given, return the value of the first element. For <select multiple>, an array of values is returend. When a value is given, set all elements to this value.
    * @return
    **/
  def `val`(): String = js.native
  /**
    * @see ZeptoCollection.val
    * @param fn
    **/
  def `val`(fn: js.Function2[/* index */ Double, /* oldValue */ js.Any, Unit]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.val
    * @param value
    * @return
    **/
  def `val`(value: js.Any): ZeptoCollection = js.native
  
  /**
    * Get the width of the first element in the collection; or set the width of all elements in the collection.
    * @return
    **/
  def width(): Double = js.native
  /**
    * @see ZeptoCollection.width
    * @param fn
    **/
  def width(fn: js.Function2[/* index */ Double, /* oldWidth */ Double, Unit]): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.width
    * @param value
    * @return
    **/
  def width(value: Double): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.wrap
    * @param fn
    **/
  def wrap(fn: js.Function1[/* index */ Double, String]): ZeptoCollection = js.native
  /**
    * Wrap each element of the collection separately in a DOM structure. Structure can be a single element or several nested elements, and can be passed in as a HTML string or DOM node, or as a function that is called for each element and returns one of the first two types.
    * Keep in mind that wrapping works best when operating on nodes that are part of the DOM. When calling wrap() on a new element and then inserting the result in the document, the element will lose the wrapping.
    * @param structure
    * @return
    **/
  def wrap(structure: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.wrap
    * @param structure
    **/
  def wrap(structure: HTMLElement): ZeptoCollection = js.native
  
  /**
    * Wrap all elements in a single structure. Structure can be a single element or several nested elements, and can be passed in as a HTML string or DOM node.
    * @param structure
    * @return
    **/
  def wrapAll(structure: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.wrapAll
    * @param structure
    **/
  def wrapAll(structure: HTMLElement): ZeptoCollection = js.native
  
  /**
    * @see ZeptoCollection.wrapInner
    * @param fn
    **/
  def wrapInner(fn: js.Function1[/* index */ Double, String]): ZeptoCollection = js.native
  /**
    * Wrap the contents of each element separately in a structure. Structure can be a single element or several nested elements, and can be passed in as a HTML string or DOM node, or as a function that is called for each element and returns one of the first two types.
    * @param structure
    * @return
    **/
  def wrapInner(structure: String): ZeptoCollection = js.native
  /**
    * @see ZeptoCollection.wrapInner
    * @param structure
    **/
  def wrapInner(structure: HTMLElement): ZeptoCollection = js.native
}
