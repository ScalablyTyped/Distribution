package typings.zui

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[STATUS with Double] = js.native
  /* 4 */ @js.native
  object DONE extends TopLevel[DONE with Double]
  
  /* 3 */ @js.native
  object FAILED extends TopLevel[FAILED with Double]
  
  /* 1 */ @js.native
  object QUEUED extends TopLevel[QUEUED with Double]
  
  /* 2 */ @js.native
  object STARTED extends TopLevel[STARTED with Double]
  
  /* 1 */ @js.native
  object STOPPED extends TopLevel[STOPPED with Double]
  
  /* 2 */ @js.native
  object UPLOADING extends TopLevel[UPLOADING with Double]
  
}

