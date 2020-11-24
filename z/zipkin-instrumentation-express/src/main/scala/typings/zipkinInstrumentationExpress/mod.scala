package typings.zipkinInstrumentationExpress

import typings.express.mod.Handler
import typings.zipkinInstrumentationExpress.anon.Port
import typings.zipkinInstrumentationExpress.anon.RemoteServiceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin-instrumentation-express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def expressMiddleware(options: Port): Handler = js.native
  
  def wrapExpressHttpProxy(
    proxy: js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler],
    options: RemoteServiceName
  ): js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler] = js.native
}
