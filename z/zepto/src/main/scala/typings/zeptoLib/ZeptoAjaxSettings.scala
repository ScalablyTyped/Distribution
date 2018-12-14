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

