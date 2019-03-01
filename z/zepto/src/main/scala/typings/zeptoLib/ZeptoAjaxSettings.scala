package typings
package zeptoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoAjaxSettings extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var beforeSend: js.UndefOr[
    js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* settings */ ZeptoAjaxSettings, scala.Boolean]
  ] = js.undefined
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var complete: js.UndefOr[
    js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* status */ java.lang.String, scala.Unit]
  ] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* errorType */ java.lang.String, 
      /* error */ stdLib.Error, 
      scala.Unit
    ]
  ] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var jsonp: js.UndefOr[java.lang.String] = js.undefined
  var jsonpCallback: js.UndefOr[js.Any] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var processData: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* data */ js.Any, 
      /* status */ java.lang.String, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ] = js.undefined
   // string or Function
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var traditional: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var xhrFields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object ZeptoAjaxSettings {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* settings */ ZeptoAjaxSettings, scala.Boolean] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    complete: js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* status */ java.lang.String, scala.Unit] = null,
    contentType: java.lang.String = null,
    context: js.Any = null,
    data: js.Any = null,
    dataType: java.lang.String = null,
    error: js.Function3[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* errorType */ java.lang.String, 
      /* error */ stdLib.Error, 
      scala.Unit
    ] = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    jsonp: java.lang.String = null,
    jsonpCallback: js.Any = null,
    mimeType: java.lang.String = null,
    password: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function3[
      /* data */ js.Any, 
      /* status */ java.lang.String, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ] = null,
    timeout: scala.Int | scala.Double = null,
    traditional: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null,
    xhrFields: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ZeptoAjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (context != null) __obj.updateDynamic("context")(context)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp)
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (success != null) __obj.updateDynamic("success")(success)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[ZeptoAjaxSettings]
  }
}

