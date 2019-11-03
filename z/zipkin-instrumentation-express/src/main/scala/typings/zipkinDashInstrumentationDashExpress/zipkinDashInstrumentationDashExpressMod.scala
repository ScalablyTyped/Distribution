package typings.zipkinDashInstrumentationDashExpress

import typings.express.expressMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-instrumentation-express", JSImport.Namespace)
@js.native
object zipkinDashInstrumentationDashExpressMod extends js.Object {
  def expressMiddleware(options: Anon_Port): Handler = js.native
  def wrapExpressHttpProxy(
    proxy: js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler],
    options: Anon_RemoteServiceName
  ): js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler] = js.native
}

