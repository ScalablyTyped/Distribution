package typings.zepto

import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeptoStatic extends js.Object {
  /**
  	* Object containing the default settings for Ajax requests. Most settings are described in $.ajax. The ones that are useful when set globally are:
  	* @example
  	*	timeout (default: 0): set to a non-zero value to specify a default timeout for Ajax requests in milliseconds
  	*	global (default: true): set to false to prevent firing Ajax events
  	*	xhr (default: XMLHttpRequest factory): set to a function that returns instances of XMLHttpRequest (or a compatible object)
  	*	accepts: MIME types to request from the server for specific dataType values:
  	*		script: “text/javascript, application/javascript”
  	*		json: “application/json”
  	*		xml: “application/xml, text/xml”
  	*		html: “text/html”
  	*		text: “text/plain”
  	**/
  var ajaxSettings: ZeptoAjaxSettings = js.native
  /**
  	* The following boolean flags are set to true if they apply, if not they're either set to 'false' or 'undefined'.  We recommend accessing them with `!!` prefixed to coerce to a boolean.
  	**/
  var browser: Anon_Chrome = js.native
  /**
  	* Zepto.fn is an object that holds all of the methods that are available on Zepto collections, such as addClass(), attr(), and other. Adding a function to this object makes that method available on every Zepto collection.
  	**/
  var fn: js.Any = js.native
  /**
  	* Effects
  	**/
  /**
  	* Global settings for animations.
  	**/
  var fx: ZeptoEffects = js.native
  /**
  	* Detect
  	**/
  /**
  	* The following boolean flags are set to true if they apply, if not they're either set to 'false' or 'undefined'.  We recommend accessing them with `!!` prefixed to coerce to a boolean.
  	**/
  var os: Anon_Android = js.native
  /**
  	* @see ZeptoStatic();
  	* @param collection
  	**/
  def apply(collection: ZeptoCollection): ZeptoCollection = js.native
  /**
  	* @see ZeptoStatic();
  	* @param element
  	**/
  def apply(element: HTMLElement): ZeptoCollection = js.native
  /**
  	* @see ZeptoStatic();
  	* @param object
  	**/
  def apply(`object`: js.Any): ZeptoCollection = js.native
  /**
  	 * Core
  	 **/
  /**
  	* Create a Zepto collection object by performing a CSS selector, wrapping DOM nodes, or creating elements from an HTML string.
  	* @param selector
  	* @param context
  	* @return
  	**/
  /**
  	* @see ZeptoStatic();
  	* @param htmlString
  	**/
  def apply(selector: String): ZeptoCollection = js.native
  /**
  	* @see ZeptoStatic();
  	* @param attributes
  	**/
  def apply(selector: String, context: js.Any): ZeptoCollection = js.native
  /**
  	* Event
  	**/
  /**
  	* Create and initialize a DOM event of the specified type. If a properties object is given, use it to extend the new event object. The event is configured to bubble by default; this can be turned off by setting the bubbles property to false.
  	* An event initialized with this function can be triggered with trigger.
  	* @param type
  	* @param properties
  	* @return
  	**/
  def Event(`type`: String, properties: js.Any): typings.std.Event = js.native
  /**
  	* Ajax
  	**/
  /**
  	* Perform an Ajax request. It can be to a local resource, or cross-domain via HTTP access control support in browsers or JSONP.
  	* Options:
  	*	type (default: “GET”): HTTP request method (“GET”, “POST”, or other)
  	*	url (default: current URL): URL to which the request is made
  	*	data (default: none): data for the request; for GET requests it is appended to query string of the URL. Non-string objects will get serialized with $.param
  	*	processData (default: true): whether to automatically serialize data for non-GET requests to string
  	*	contentType (default: “application/x-www-form-urlencoded”): the Content-Type of the data being posted to the server (this can also be set via headers). Pass false to skip setting the default value.
  	*	dataType (default: none): response type to expect from the server (“json”, “jsonp”, “xml”, “html”, or “text”)
  	*	timeout (default: 0): request timeout in milliseconds, 0 for no timeout
  	*	headers: object of additional HTTP headers for the Ajax request
  	*	async (default: true): set to false to issue a synchronous (blocking) request
  	*	global (default: true): trigger global Ajax events on this request
  	*	context (default: window): context to execute callbacks in
  	*	traditional (default: false): activate traditional (shallow) serialization of data parameters with $.param
  	*  If the URL contains =? or dataType is “jsonp”, the request is performed by injecting a <script> tag instead of using XMLHttpRequest (see JSONP). This has the limitation of contentType, dataType, headers, and async not being supported.
  	* @param options
  	* @return
  	**/
  def ajax(options: ZeptoAjaxSettings): XMLHttpRequest = js.native
  /**
  	* Perform a JSONP request to fetch data from another domain.
  	* This method has no advantages over $.ajax and should not be used.
  	* @param options Ajax settings to use with JSONP call.
  	* @deprecated use $.ajax instead.
  	**/
  def ajaxJSONP(options: ZeptoAjaxSettings): XMLHttpRequest = js.native
  		// window and document tests break without this
  /**
  	* Turn a dasherized string into “camel case”. Doesn’t affect already camel-cased strings.
  	* @param str
  	* @return
  	**/
  def camelCase(str: String): String = js.native
  /**
  	* Check if the parent node contains the given DOM node. Returns false if both are the same node.
  	* @param parent
  	* @param node
  	* @return
  	**/
  def contains(parent: HTMLElement, node: HTMLElement): Boolean = js.native
  /**
  	* @see ZeptoStatic.each
  	**/
  def each(collection: js.Any, fn: js.Function2[/* key */ String, /* value */ js.Any, Boolean]): Unit = js.native
  /**
  	* Iterate over array elements or object key-value pairs. Returning false from the iterator function stops the iteration.
  	* @param collection
  	* @param fn
  	**/
  def each(collection: js.Array[_], fn: js.Function2[/* index */ Double, /* item */ js.Any, Boolean]): Unit = js.native
  /**
  	* @see ZeptoStatic.extend
  	* @param deep
  	**/
  def extend(deep: Boolean, target: js.Any, sources: js.Any*): js.Any = js.native
  /**
  	* Extend target object with properties from each of the source objects, overriding the properties on target.
  	* By default, copying is shallow. An optional true for the first argument triggers deep (recursive) copying.
  	* @param target
  	* @param sources
  	* @return
  	**/
  def extend(target: js.Any, sources: js.Any*): js.Any = js.native
  /**
  	* @see ZeptoStatic.get
  	* @param data See ZeptoAjaxSettings.data
  	**/
  def get(
    url: String,
    data: js.Any,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ): XMLHttpRequest = js.native
  /**
  	* Perform an Ajax GET request. This is a shortcut for the $.ajax method.
  	* @param url URL to send the HTTP GET request to.
  	* @param fn Callback function when the HTTP GET request is completed.
  	* @return The XMLHttpRequest object.
  	**/
  def get(
    url: String,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ): XMLHttpRequest = js.native
  /**
  	* @see ZeptoStatic.getJSON
  	* @param data See ZeptoAjaxSettings.data
  	**/
  def getJSON(
    url: String,
    data: js.Any,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ): XMLHttpRequest = js.native
  /**
  	* Get JSON data via Ajax GET request. This is a shortcut for the $.ajax method.
  	* @param url URL to send the HTTP GET request to.
  	* @param fn Callback function when the HTTP GET request is completed.
  	* @return The XMLHttpRequest object.
  	**/
  def getJSON(
    url: String,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ): XMLHttpRequest = js.native
  /**
  	* Get a new array containing only the items for which the callback function returned true.
  	* @param items
  	* @param fn
  	* @return
  	**/
  def grep(items: js.Array[_], fn: js.Function1[/* item */ js.Any, Boolean]): js.Array[_] = js.native
  /**
  	* Get the position of element inside an array, or -1 if not found.
  	* @param element
  	* @param array
  	* @param fromIndex
  	* @return
  	**/
  def inArray(element: js.Any, array: js.Array[_]): Double = js.native
  def inArray(element: js.Any, array: js.Array[_], fromIndex: Double): Double = js.native
  /**
  	* True if the object is an array.
  	* @param object
  	* @return
  	**/
  def isArray(`object`: js.Any): Boolean = js.native
  /**
  	* True if the object is a function.
  	* @param object
  	* @return
  	**/
  def isFunction(`object`: js.Any): Boolean = js.native
  /**
  	* True if the object is a “plain” JavaScript object, which is only true for object literals and objects created with new Object.
  	* @param object
  	* @return
  	**/
  def isPlainObject(`object`: js.Any): Boolean = js.native
  /**
  	* True if the object is a window object. This is useful for iframes where each one has its own window, and where these objects fail the regular obj === window check.
  	* @param object
  	* @return
  	**/
  def isWindow(`object`: js.Any): Boolean = js.native
  /**
  	* Iterate through elements of collection and return all results of running the iterator function, with null and undefined values filtered out.
  	* @param collection
  	* @param fn
  	* @return
  	**/
  def map(collection: js.Array[_], fn: js.Function2[/* item */ js.Any, /* index */ Double, _]): js.Array[_] = js.native
  /**
  	* Serialize an object to a URL-encoded string representation for use in Ajax request query strings and post data. If shallow is set, nested objects are not serialized and nested array values won’t use square brackets on their keys.
  	* Also accepts an array in serializeArray format, where each item has “name” and “value” properties.
  	* @param object Serialize this object to URL-encoded string representation.
  	* @param shallow Only serialize the first level of `object`.
  	* @return Seralized URL-encoded string representation of `object`.
  	**/
  def param(`object`: js.Any): String = js.native
  def param(`object`: js.Any, shallow: Boolean): String = js.native
  /**
  	* Alias for the native JSON.parse method.
  	* @param str
  	* @retrun
  	**/
  def parseJSON(str: String): js.Any = js.native
  /**
  	* @see ZeptoStatic.post
  	* @param data See ZeptoAjaxSettings.data
  	**/
  def post(
    url: String,
    data: js.Any,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ): XMLHttpRequest = js.native
  def post(
    url: String,
    data: js.Any,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit],
    dataType: String
  ): XMLHttpRequest = js.native
  /**
  	* Perform an Ajax POST request. This is a shortcut for the $.ajax method.
  	* @param url URL to send the HTTP POST request to.
  	* @param fn Callback function when the HTTP POST request is completed.
  	* @return The XMLHttpRequest object.
  	**/
  def post(
    url: String,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ): XMLHttpRequest = js.native
  def post(
    url: String,
    fn: js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit],
    dataType: String
  ): XMLHttpRequest = js.native
  /**
  	* Get a function that ensures that the value of this in the original function refers to the context object. In the second form, the original function is read from the specific property of the context object.
  	**/
  def proxy(fn: js.Function, context: js.Any): js.Function = js.native
  /**
  	* Remove whitespace from beginning and end of a string; just like String.prototype.trim().
  	* @param str
  	* @return
  	**/
  def trim(str: String): String = js.native
  /**
  	* Get string type of an object. Possible types are: null undefined boolean number string function array date regexp object error.
  	* For other objects it will simply report “object”. To find out if an object is a plain JavaScript object, use isPlainObject.
  	* @param object
  	* @return
  	**/
  def `type`(`object`: js.Any): String = js.native
}

