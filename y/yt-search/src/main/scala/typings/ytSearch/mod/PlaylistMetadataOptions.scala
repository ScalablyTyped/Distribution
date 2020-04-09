package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistMetadataOptions extends js.Object {
  var listId: String
}

object PlaylistMetadataOptions {
  @scala.inline
  def apply(listId: String): PlaylistMetadataOptions = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaylistMetadataOptions]
  }
}

