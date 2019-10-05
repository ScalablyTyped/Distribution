package typings.zenDashObservableDashTs.zenDashObservableDashTsMod

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayLike
import typings.zenDashObservableDashTs.libTypesMod.ZenObservable.ObservableLike
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import typings.zenDashObservableDashTs.libZenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", JSImport.Default)
@js.native
object default
  extends Instantiable1[/* subscriber */ Subscriber[js.Object], Observable[js.Object]] {
  def from[R](observable: ArrayLike[R]): Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): Observable[R] = js.native
  def from[R](observable: Observable[R]): Observable[R] = js.native
  def of[R](args: R*): Observable[R] = js.native
}

