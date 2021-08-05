package typings.zipkinInstrumentationExpress

import typings.express.mod.Handler
import typings.zipkinInstrumentationExpress.anon.Port
import typings.zipkinInstrumentationExpress.anon.RemoteServiceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-instrumentation-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expressMiddleware(options: Port): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("expressMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  inline def wrapExpressHttpProxy(
    proxy: js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler],
    options: RemoteServiceName
  ): js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapExpressHttpProxy")(proxy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* host */ String, /* options */ js.UndefOr[js.Any], Handler]]
}
