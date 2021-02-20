package typings.zepto

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZeptoAjaxSettings extends StObject {
  
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
  implicit class ZeptoAjaxSettingsMutableBuilder[Self <: ZeptoAjaxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setBeforeSend(value: (/* xhr */ XMLHttpRequest, ZeptoAjaxSettings) => Boolean): Self = StObject.set(x, "beforeSend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setComplete(value: (/* xhr */ XMLHttpRequest, /* status */ String) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: (/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setJsonp(value: String): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpCallback(value: js.Any): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setProcessData(value: Boolean): Self = StObject.set(x, "processData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTraditional(value: Boolean): Self = StObject.set(x, "traditional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraditionalUndefined: Self = StObject.set(x, "traditional", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setXhrFields(value: StringDictionary[js.Any]): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrFieldsUndefined: Self = StObject.set(x, "xhrFields", js.undefined)
  }
}
