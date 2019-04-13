package typings
package zenDashObservableDashTsLib.zenDashObservableDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", JSImport.Default)
@js.native
object default
  extends org.scalablytyped.runtime.Instantiable1[
      /* subscriber */ zenDashObservableDashTsLib.libZenObservableMod.Subscriber[js.Object], 
      zenDashObservableDashTsLib.libZenObservableMod.Observable[js.Object]
    ] {
  def from[R](observable: stdLib.ArrayLike[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.ObservableLike[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: zenDashObservableDashTsLib.libZenObservableMod.Observable[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def of[R](args: R*): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
}

