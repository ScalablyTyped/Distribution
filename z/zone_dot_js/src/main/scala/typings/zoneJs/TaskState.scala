package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task type: `notScheduled`, `scheduling`, `scheduled`, `running`, `canceling`, 'unknown'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.zoneJs.zoneJsStrings.notScheduled
  - typings.zoneJs.zoneJsStrings.scheduling
  - typings.zoneJs.zoneJsStrings.scheduled
  - typings.zoneJs.zoneJsStrings.running
  - typings.zoneJs.zoneJsStrings.canceling
  - typings.zoneJs.zoneJsStrings.unknown
*/
trait TaskState extends js.Object

object TaskState {
  @scala.inline
  def canceling: typings.zoneJs.zoneJsStrings.canceling = this.cast("canceling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notScheduled: typings.zoneJs.zoneJsStrings.notScheduled = this.cast("notScheduled")
  @scala.inline
  def running: typings.zoneJs.zoneJsStrings.running = this.cast("running")
  @scala.inline
  def scheduled: typings.zoneJs.zoneJsStrings.scheduled = this.cast("scheduled")
  @scala.inline
  def scheduling: typings.zoneJs.zoneJsStrings.scheduling = this.cast("scheduling")
  @scala.inline
  def unknown: typings.zoneJs.zoneJsStrings.unknown = this.cast("unknown")
}

