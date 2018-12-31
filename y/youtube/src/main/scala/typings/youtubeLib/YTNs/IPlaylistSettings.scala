package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaylistSettings extends VideoOrPlaylistSettings {
  /**
  		 * Start index of the playlist, if not 0.
  		 */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Identifier for the listType videos list.
  		 */
  var list: java.lang.String
  /**
  		 * Which type of content loads in the player.
  		 */
  var listType: js.UndefOr[ListType] = js.undefined
}

