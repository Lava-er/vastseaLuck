package cn.zcc

import net.md_5.bungee.api.plugin.Plugin

class VastseaLuck : Plugin() {
    companion object {
        @JvmStatic
        lateinit var vastseaLuck: VastseaLuck
    }

    override fun onLoad() {
        vastseaLuck = this
    }

    override fun onEnable() {

    }

}