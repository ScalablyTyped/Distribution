package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request {
  var CURRENT_APP: java.lang.String = js.native
  @JSName("ralP")
  var ralP_Original: yog2DashKernelLib.Fn_Name = js.native
  @JSName("ral")
  var ral_Original: yog2DashKernelLib.Anon_AppendExtPath = js.native
  def ral(serviceName: java.lang.String): nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner = js.native
  def ral(serviceName: java.lang.String, options: js.Object): nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner = js.native
  def ralP[T](name: java.lang.String): js.Promise[T] = js.native
  def ralP[T](name: java.lang.String, options: js.Object): js.Promise[T] = js.native
}

