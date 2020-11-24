package typings.zapierPlatformCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseHttpResponse extends js.Object {
  
  def getHeader(key: String): js.UndefOr[String] = js.native
  
  var headers: StringDictionary[String] = js.native
  
  var request: HttpRequestOptions = js.native
  
  var skipThrowForStatus: Boolean = js.native
  
  var status: Double = js.native
  
  def throwForStatus(): Unit = js.native
}
object BaseHttpResponse {
  
  @scala.inline
  def apply(
    getHeader: String => js.UndefOr[String],
    headers: StringDictionary[String],
    request: HttpRequestOptions,
    skipThrowForStatus: Boolean,
    status: Double,
    throwForStatus: () => Unit
  ): BaseHttpResponse = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], skipThrowForStatus = skipThrowForStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
    __obj.asInstanceOf[BaseHttpResponse]
  }
  
  @scala.inline
  implicit class BaseHttpResponseOps[Self <: BaseHttpResponse] (val x: Self) extends AnyVal {
    
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
    def setGetHeader(value: String => js.UndefOr[String]): Self = this.set("getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: HttpRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipThrowForStatus(value: Boolean): Self = this.set("skipThrowForStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowForStatus(value: () => Unit): Self = this.set("throwForStatus", js.Any.fromFunction0(value))
  }
}
