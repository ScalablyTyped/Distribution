package typings.zenObservableTs.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayLike
import typings.zenObservableTs.typesMod.ZenObservable.ObservableLike
import typings.zenObservableTs.zenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", JSImport.Default)
@js.native
object default
  extends Instantiable1[
      /* subscriber */ Subscriber[js.Object], 
      typings.zenObservableTs.zenObservableMod.Observable[js.Object]
    ] {
  def from[R](observable: ArrayLike[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = js.native
  def from[R](observable: typings.zenObservableTs.zenObservableMod.Observable[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = js.native
  def of[R](args: R*): typings.zenObservableTs.zenObservableMod.Observable[R] = js.native
}

