package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zoneDotJsLib {
  /**
   * Task type: `notScheduled`, `scheduling`, `scheduled`, `running`, `canceling`, 'unknown'.
   */
  type TaskState = zoneDotJsLib.zoneDotJsLibStrings.notScheduled | zoneDotJsLib.zoneDotJsLibStrings.scheduling | zoneDotJsLib.zoneDotJsLibStrings.scheduled | zoneDotJsLib.zoneDotJsLibStrings.running | zoneDotJsLib.zoneDotJsLibStrings.canceling | zoneDotJsLib.zoneDotJsLibStrings.unknown
  /**
   * Task type: `microTask`, `macroTask`, `eventTask`.
   */
  type TaskType = zoneDotJsLib.zoneDotJsLibStrings.microTask | zoneDotJsLib.zoneDotJsLibStrings.macroTask | zoneDotJsLib.zoneDotJsLibStrings.eventTask
}
