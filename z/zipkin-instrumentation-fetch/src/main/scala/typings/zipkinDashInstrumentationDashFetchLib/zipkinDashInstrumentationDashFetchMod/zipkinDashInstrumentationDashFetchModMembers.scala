package typings
package zipkinDashInstrumentationDashFetchLib.zipkinDashInstrumentationDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-instrumentation-fetch", JSImport.Namespace)
@js.native
object zipkinDashInstrumentationDashFetchModMembers extends js.Object {
  def apply(
    rawFetch: js.Function2[
      /* url */ nodeDashFetchLib.nodeDashFetchMod.Request, 
      /* init */ nodeDashFetchLib.nodeDashFetchMod.RequestInit, 
      js.Promise[nodeDashFetchLib.nodeDashFetchMod.Response]
    ],
    options: Options
  ): js.Function2[
    /* url */ nodeDashFetchLib.nodeDashFetchMod.Request, 
    /* init */ nodeDashFetchLib.nodeDashFetchMod.RequestInit, 
    js.Promise[nodeDashFetchLib.nodeDashFetchMod.Response]
  ] = js.native
}

