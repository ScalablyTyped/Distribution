package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATUS extends js.Object

@JSGlobal("STATUS")
@js.native
object STATUS extends js.Object {
  @js.native
  sealed trait DONE extends STATUS
  
  @js.native
  sealed trait FAILED extends STATUS
  
  @js.native
  sealed trait QUEUED extends STATUS
  
  @js.native
  sealed trait STARTED extends STATUS
  
  @js.native
  sealed trait STOPPED extends STATUS
  
  @js.native
  sealed trait UPLOADING extends STATUS
  
  /* 4 */ val DONE: typings.zui.STATUS.DONE with Double = js.native
  /* 3 */ val FAILED: typings.zui.STATUS.FAILED with Double = js.native
  /* 1 */ val QUEUED: typings.zui.STATUS.QUEUED with Double = js.native
  /* 2 */ val STARTED: typings.zui.STATUS.STARTED with Double = js.native
  /* 1 */ val STOPPED: typings.zui.STATUS.STOPPED with Double = js.native
  /* 2 */ val UPLOADING: typings.zui.STATUS.UPLOADING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[STATUS with Double] = js.native
}

