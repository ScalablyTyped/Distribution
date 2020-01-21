package typings.yog2Kernel.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.yog2Kernel.TypeofRAL
import typings.yog2Kernel.TypeofRALPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any] {
  var CURRENT_APP: String = js.native
  var ral: TypeofRAL = js.native
  var ralP: TypeofRALPromise = js.native
}

