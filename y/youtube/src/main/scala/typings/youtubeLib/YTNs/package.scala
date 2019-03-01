package typings
package youtubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object YTNs {
  type ListType = ListTypePlayer | ListTypeSearch | ListTypeUserUploads
  type ListTypePlayer = youtubeLib.youtubeLibStrings.player
  type ListTypeSearch = youtubeLib.youtubeLibStrings.search
  type ListTypeUserUploads = youtubeLib.youtubeLibStrings.user_uploads
  type PlayerEventHandler[TEvent /* <: PlayerEvent */] = js.Function1[/* event */ TEvent, scala.Unit]
  type SuggestedVideoQuality = VideoQualityDefault | VideoQualitySmall | VideoQualityMedium | VideoQualityLarge | VideoQualityHD720 | VideoQualityHD1080 | VideoQualityHighRes
  type VideoQualityDefault = youtubeLib.youtubeLibStrings.default
  type VideoQualityHD1080 = youtubeLib.youtubeLibStrings.hd1080
  type VideoQualityHD720 = youtubeLib.youtubeLibStrings.hd720
  type VideoQualityHighRes = youtubeLib.youtubeLibStrings.highres
  type VideoQualityLarge = youtubeLib.youtubeLibStrings.large
  type VideoQualityMedium = youtubeLib.youtubeLibStrings.medium
  type VideoQualitySmall = youtubeLib.youtubeLibStrings.small
}
