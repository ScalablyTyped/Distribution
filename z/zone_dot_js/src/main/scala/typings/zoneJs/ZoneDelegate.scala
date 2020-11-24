package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  A delegate when intercepting zone operations.
  *
  *  A ZoneDelegate is needed because a child zone can't simply invoke a method on a parent zone. For
  *  example a child zone wrap can't just call parent zone wrap. Doing so would create a callback
  *  which is bound to the parent zone. What we are interested in is intercepting the callback before
  *  it is bound to any zone. Furthermore, we also need to pass the targetZone (zone which received
  *  the original request) to the delegate.
  *
  *  The ZoneDelegate methods mirror those of Zone with an addition of extra targetZone argument in
  *  the method signature. (The original Zone which received the request.) Some methods are renamed
  *  to prevent confusion, because they have slightly different semantics and arguments.
  *
  *  - `wrap` => `intercept`: The `wrap` method delegates to `intercept`. The `wrap` method returns
  *     a callback which will run in a given zone, where as intercept allows wrapping the callback
  *     so that additional code can be run before and after, but does not associate the callback
  *     with the zone.
  *  - `run` => `invoke`: The `run` method delegates to `invoke` to perform the actual execution of
  *     the callback. The `run` method switches to new zone; saves and restores the `Zone.current`;
  *     and optionally performs error handling. The invoke is not responsible for error handling,
  *     or zone management.
  *
  *  Not every method is usually overwritten in the child zone, for this reason the ZoneDelegate
  *  stores the closest zone which overwrites this behavior along with the closest ZoneSpec.
  *
  *  NOTE: We have tried to make this API analogous to Event bubbling with target and current
  *  properties.
  *
  *  Note: The ZoneDelegate treats ZoneSpec as class. This allows the ZoneSpec to use its `this` to
  *  store internal state.
  */
@js.native
trait ZoneDelegate extends js.Object {
  
  def cancelTask(targetZone: Zone, task: Task): js.Any = js.native
  
  def fork(targetZone: Zone, zoneSpec: ZoneSpec): Zone = js.native
  
  def handleError(targetZone: Zone, error: js.Any): Boolean = js.native
  
  def hasTask(targetZone: Zone, isEmpty: HasTaskState): Unit = js.native
  
  def intercept(targetZone: Zone, callback: js.Function, source: String): js.Function = js.native
  
  def invoke(targetZone: Zone, callback: js.Function): js.Any = js.native
  def invoke(
    targetZone: Zone,
    callback: js.Function,
    applyThis: js.UndefOr[scala.Nothing],
    applyArgs: js.UndefOr[scala.Nothing],
    source: String
  ): js.Any = js.native
  def invoke(
    targetZone: Zone,
    callback: js.Function,
    applyThis: js.UndefOr[scala.Nothing],
    applyArgs: js.Array[_]
  ): js.Any = js.native
  def invoke(
    targetZone: Zone,
    callback: js.Function,
    applyThis: js.UndefOr[scala.Nothing],
    applyArgs: js.Array[_],
    source: String
  ): js.Any = js.native
  def invoke(targetZone: Zone, callback: js.Function, applyThis: js.Any): js.Any = js.native
  def invoke(
    targetZone: Zone,
    callback: js.Function,
    applyThis: js.Any,
    applyArgs: js.UndefOr[scala.Nothing],
    source: String
  ): js.Any = js.native
  def invoke(targetZone: Zone, callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_]): js.Any = js.native
  def invoke(targetZone: Zone, callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_], source: String): js.Any = js.native
  
  def invokeTask(targetZone: Zone, task: Task): js.Any = js.native
  def invokeTask(targetZone: Zone, task: Task, applyThis: js.UndefOr[scala.Nothing], applyArgs: js.Array[_]): js.Any = js.native
  def invokeTask(targetZone: Zone, task: Task, applyThis: js.Any): js.Any = js.native
  def invokeTask(targetZone: Zone, task: Task, applyThis: js.Any, applyArgs: js.Array[_]): js.Any = js.native
  
  def scheduleTask(targetZone: Zone, task: Task): Task = js.native
  
  var zone: Zone = js.native
}
