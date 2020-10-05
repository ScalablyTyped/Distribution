package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def canceling: typings.zoneJs.zoneJsStrings.canceling = "canceling".asInstanceOf[typings.zoneJs.zoneJsStrings.canceling]
  @scala.inline
  def notScheduled: typings.zoneJs.zoneJsStrings.notScheduled = "notScheduled".asInstanceOf[typings.zoneJs.zoneJsStrings.notScheduled]
  @scala.inline
  def running: typings.zoneJs.zoneJsStrings.running = "running".asInstanceOf[typings.zoneJs.zoneJsStrings.running]
  @scala.inline
  def scheduled: typings.zoneJs.zoneJsStrings.scheduled = "scheduled".asInstanceOf[typings.zoneJs.zoneJsStrings.scheduled]
  @scala.inline
  def scheduling: typings.zoneJs.zoneJsStrings.scheduling = "scheduling".asInstanceOf[typings.zoneJs.zoneJsStrings.scheduling]
  @scala.inline
  def unknown: typings.zoneJs.zoneJsStrings.unknown = "unknown".asInstanceOf[typings.zoneJs.zoneJsStrings.unknown]
}

