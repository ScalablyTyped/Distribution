package typings.zapierDashPlatformDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cursor extends js.Object {
  def get(): js.Promise[String]
  def set(cursor: String): js.Promise[Null]
}

object Anon_Cursor {
  @scala.inline
  def apply(get: () => js.Promise[String], set: String => js.Promise[Null]): Anon_Cursor = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Anon_Cursor]
  }
}

