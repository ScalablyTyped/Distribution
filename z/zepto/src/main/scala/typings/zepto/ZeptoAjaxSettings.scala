package typings.zepto

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeptoAjaxSettings extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var beforeSend: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* settings */ this.type, Boolean]] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var complete: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* status */ String, Unit]] = js.native
  var contentType: js.UndefOr[String] = js.native
  var context: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dataType: js.UndefOr[String] = js.native
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error, Unit]
  ] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var jsonp: js.UndefOr[String] = js.native
  var jsonpCallback: js.UndefOr[js.Any] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var processData: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ] = js.native
   // string or Function
  var timeout: js.UndefOr[Double] = js.native
  var traditional: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
  var xhrFields: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object ZeptoAjaxSettings {
  @scala.inline
  def apply(): ZeptoAjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeptoAjaxSettings]
  }
  @scala.inline
  implicit class ZeptoAjaxSettingsOps[Self <: ZeptoAjaxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBeforeSend(value: (/* xhr */ XMLHttpRequest, ZeptoAjaxSettings) => Boolean): Self = this.set("beforeSend", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setComplete(value: (/* xhr */ XMLHttpRequest, /* status */ String) => Unit): Self = this.set("complete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setError(value: (/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setJsonp(value: String): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    @scala.inline
    def setJsonpCallback(value: js.Any): Self = this.set("jsonpCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonpCallback: Self = this.set("jsonpCallback", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setProcessData(value: Boolean): Self = this.set("processData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessData: Self = this.set("processData", js.undefined)
    @scala.inline
    def setSuccess(value: (/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest) => Unit): Self = this.set("success", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTraditional(value: Boolean): Self = this.set("traditional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraditional: Self = this.set("traditional", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setXhrFields(value: StringDictionary[js.Any]): Self = this.set("xhrFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrFields: Self = this.set("xhrFields", js.undefined)
  }
  
}

