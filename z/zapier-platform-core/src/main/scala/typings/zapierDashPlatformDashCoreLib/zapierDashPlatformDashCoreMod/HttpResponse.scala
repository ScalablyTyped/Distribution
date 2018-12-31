package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var body: js.UndefOr[nodeLib.NodeJSNs.ReadableStream] = js.undefined
  var content: java.lang.String | nodeLib.Buffer
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var json: js.UndefOr[js.Object | js.Promise[js.UndefOr[js.Object]]]
  var request: HttpRequestOptions
  var status: scala.Double
  def getHeader(key: java.lang.String): js.UndefOr[java.lang.String]
  def throwForStatus(): scala.Unit
}

