package typings.zipkinInstrumentationExpress

import typings.express.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-instrumentation-express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def expressMiddleware(options: AnonPort): Handler = js.native
  def wrapExpressHttpProxy(
    proxy: js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler],
    options: AnonRemoteServiceName
  ): js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler] = js.native
}

