package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneType extends js.Object {
  /**
    * @returns {Zone} Returns the current [Zone]. The only way to change
    * the current zone is by invoking a run() method, which will update the current zone for the
    * duration of the run method callback.
    */
  var current: Zone = js.native
  /**
    * @returns {Task} The task associated with the current execution.
    */
  var currentTask: Task | Null = js.native
  /**
    *  Return the root zone.
    */
  var root: Zone = js.native
  /**
    * load patch for specified native module, allow user to
    * define their own patch, user can use this API after loading zone.js
    */
  def __load_patch(name: String, fn: PatchFn): Unit = js.native
  /**
    * Zone symbol API to generate a string with __zone_symbol__ prefix
    */
  def __symbol__(name: String): String = js.native
  /**
    * Verify that Zone has been correctly patched. Specifically that Promise is zone aware.
    */
  def assertZonePatched(): Unit = js.native
}

object ZoneType {
  @scala.inline
  def apply(
    __load_patch: (String, PatchFn) => Unit,
    __symbol__ : String => String,
    assertZonePatched: () => Unit,
    current: Zone,
    root: Zone
  ): ZoneType = {
    val __obj = js.Dynamic.literal(__load_patch = js.Any.fromFunction2(__load_patch), __symbol__ = js.Any.fromFunction1(__symbol__), assertZonePatched = js.Any.fromFunction0(assertZonePatched), current = current.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneType]
  }
  @scala.inline
  implicit class ZoneTypeOps[Self <: ZoneType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__load_patch(value: (String, PatchFn) => Unit): Self = this.set("__load_patch", js.Any.fromFunction2(value))
    @scala.inline
    def set__symbol__(value: String => String): Self = this.set("__symbol__", js.Any.fromFunction1(value))
    @scala.inline
    def setAssertZonePatched(value: () => Unit): Self = this.set("assertZonePatched", js.Any.fromFunction0(value))
    @scala.inline
    def setCurrent(value: Zone): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: Zone): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTask(value: Task): Self = this.set("currentTask", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTaskNull: Self = this.set("currentTask", null)
  }
  
}

