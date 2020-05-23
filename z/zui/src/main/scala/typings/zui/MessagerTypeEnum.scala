package typings.zui

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
  
}

