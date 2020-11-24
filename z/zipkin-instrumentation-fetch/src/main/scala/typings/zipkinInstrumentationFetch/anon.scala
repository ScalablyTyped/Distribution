package typings.zipkinInstrumentationFetch

import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Typeoffetch extends js.Object {
    
    def apply(url: RequestInfo): js.Promise[Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    def isRedirect(code: Double): Boolean = js.native
  }
}
