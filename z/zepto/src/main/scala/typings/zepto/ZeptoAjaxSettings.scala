package typings.zepto

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoAjaxSettings extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var beforeSend: js.UndefOr[
    js.Function2[/* xhr */ XMLHttpRequest, /* settings */ ZeptoAjaxSettings, Boolean]
  ] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var complete: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* status */ String, Unit]] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error, Unit]
  ] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var jsonp: js.UndefOr[String] = js.undefined
  var jsonpCallback: js.UndefOr[js.Any] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var processData: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ] = js.undefined
   // string or Function
  var timeout: js.UndefOr[Double] = js.undefined
  var traditional: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var xhrFields: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ZeptoAjaxSettings {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: (/* xhr */ XMLHttpRequest, /* settings */ ZeptoAjaxSettings) => Boolean = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    complete: (/* xhr */ XMLHttpRequest, /* status */ String) => Unit = null,
    contentType: String = null,
    context: js.Any = null,
    data: js.Any = null,
    dataType: String = null,
    error: (/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error) => Unit = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    jsonp: String = null,
    jsonpCallback: js.Any = null,
    mimeType: String = null,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    success: (/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest) => Unit = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String = null,
    username: String = null,
    xhrFields: StringDictionary[js.Any] = null
  ): ZeptoAjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction2(beforeSend))
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoAjaxSettings]
  }
}

