package typings.zui

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessagerTypeEnum extends js.Object

/**
  * messager
  */
@JSGlobal("MessagerTypeEnum")
@js.native
object MessagerTypeEnum extends js.Object {
  @js.native
  sealed trait danger extends MessagerTypeEnum
  
  @js.native
  sealed trait default extends MessagerTypeEnum
  
  @js.native
  sealed trait important extends MessagerTypeEnum
  
  @js.native
  sealed trait info extends MessagerTypeEnum
  
  @js.native
  sealed trait primary extends MessagerTypeEnum
  
  @js.native
  sealed trait special extends MessagerTypeEnum
  
  @js.native
  sealed trait success extends MessagerTypeEnum
  
  @js.native
  sealed trait warning extends MessagerTypeEnum
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessagerTypeEnum with Double] = js.native
  /* 5 */ @js.native
  object danger extends TopLevel[danger with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 6 */ @js.native
  object important extends TopLevel[important with Double]
  
  /* 3 */ @js.native
  object info extends TopLevel[info with Double]
  
  /* 1 */ @js.native
  object primary extends TopLevel[primary with Double]
  
  /* 7 */ @js.native
  object special extends TopLevel[special with Double]
  
  /* 2 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 4 */ @js.native
  object warning extends TopLevel[warning with Double]
  
}

