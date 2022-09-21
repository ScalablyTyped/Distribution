package typings.zipkinInstrumentationFetch

import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(url: RequestInfo): js.Promise[Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
}
