package typings.zenDashObservableDashTs.zenDashObservableDashTsMod

import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import typings.zenDashObservableDashTs.libZenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", JSImport.Default)
@js.native
class defaultCls[T] protected () extends Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

