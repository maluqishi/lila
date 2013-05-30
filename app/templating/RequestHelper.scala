package lila.app
package templating

import lila.user.Context

trait RequestHelper {

  def currentUrl(implicit ctx: Context) = ctx.req.host + ctx.req.uri
}
