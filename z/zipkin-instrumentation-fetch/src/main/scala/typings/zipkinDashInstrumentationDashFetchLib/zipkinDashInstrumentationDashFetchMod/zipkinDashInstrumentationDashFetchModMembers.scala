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
      /* url */ java.lang.String | nodeDashFetchLib.nodeDashFetchMod.fetchNs.Request, 
      /* init */ nodeDashFetchLib.nodeDashFetchMod.fetchNs.RequestInit, 
      stdLib.Promise[nodeDashFetchLib.nodeDashFetchMod.fetchNs.Response]
    ],
    options: Options
  ): js.Function2[
    /* url */ java.lang.String | nodeDashFetchLib.nodeDashFetchMod.fetchNs.Request, 
    /* init */ nodeDashFetchLib.nodeDashFetchMod.fetchNs.RequestInit, 
    stdLib.Promise[nodeDashFetchLib.nodeDashFetchMod.fetchNs.Response]
  ] = js.native
}

