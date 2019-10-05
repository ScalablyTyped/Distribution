package typings.zenDashObservableDashTs.zenDashObservableDashTsMod

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayLike
import typings.zenDashObservableDashTs.libTypesMod.ZenObservable.ObservableLike
import typings.zenDashObservableDashTs.libZenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", "Observable")
@js.native
object Observable
  extends Instantiable1[
      /* subscriber */ Subscriber[js.Object], 
      typings.zenDashObservableDashTs.libZenObservableMod.Observable[js.Object]
    ] {
  def from[R](observable: ArrayLike[R]): typings.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): typings.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: typings.zenDashObservableDashTs.libZenObservableMod.Observable[R]): typings.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def of[R](args: R*): typings.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
}

