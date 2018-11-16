package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATUS extends js.Object

@JSGlobal("STATUS")
@js.native
object STATUS extends js.Object {
  @js.native
  sealed trait DONE
    extends zuiLib.STATUS
  
  @js.native
  sealed trait FAILED
    extends zuiLib.STATUS
  
  @js.native
  sealed trait QUEUED
    extends zuiLib.STATUS
  
  @js.native
  sealed trait STARTED
    extends zuiLib.STATUS
  
  @js.native
  sealed trait STOPPED
    extends zuiLib.STATUS
  
  @js.native
  sealed trait UPLOADING
    extends zuiLib.STATUS
  
  /* 4 */ val DONE: DONE with scala.Double = js.native
  /* 3 */ val FAILED: FAILED with scala.Double = js.native
  /* 1 */ val QUEUED: QUEUED with scala.Double = js.native
  /* 2 */ val STARTED: STARTED with scala.Double = js.native
  /* 1 */ val STOPPED: STOPPED with scala.Double = js.native
  /* 2 */ val UPLOADING: UPLOADING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[zuiLib.STATUS with scala.Double] = js.native
}

