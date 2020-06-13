package ru.buseso.dreamtime.helpme;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class HelpCmd extends Command {
    public HelpCmd(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender s, String[] args) {
        s.sendMessage(TextComponent.fromLegacyText("§e▉▉▉▉▉▉▉▉▉▉▉▉ §aПомощь по серверу §e▉▉▉▉▉▉▉▉▉▉▉▉"));

        TextComponent f = new TextComponent(TextComponent.fromLegacyText("§a > §7/help - Помощь по серверу"));
        f.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        f.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/help"));
        s.sendMessage(f);

        TextComponent se = new TextComponent(TextComponent.fromLegacyText("§a > §7/ticket - Всё о тикетах (https://dreamtime.su/tickets)"));
        se.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        se.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ticket"));
        s.sendMessage(se);

        TextComponent t = new TextComponent(TextComponent.fromLegacyText("§a > §7/hub - Вернуться в хаб"));
        t.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        t.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/hub"));
        s.sendMessage(t);

        TextComponent g = new TextComponent(TextComponent.fromLegacyText("§a > §7/money - Посмотреть свой баланс"));
        g.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        g.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/money"));
        s.sendMessage(g);

        TextComponent m = new TextComponent(TextComponent.fromLegacyText("§a > §7/msg <ник> <сообщение> - Написать игроку в ЛС"));
        m.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        m.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/msg "));
        s.sendMessage(m);

        TextComponent mt = new TextComponent(TextComponent.fromLegacyText("§a > §7/msgtoggle - Выключить получение сообщений"));
        mt.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        mt.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/msgtoggle"));
        s.sendMessage(mt);

        TextComponent r = new TextComponent(TextComponent.fromLegacyText("§a > §7/r <сообщение> - Быстро ответить на последнее сообщение"));
        r.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        r.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/r "));
        s.sendMessage(r);

        TextComponent fr = new TextComponent(TextComponent.fromLegacyText("§a > §7/friend - Помощь по друзьям"));
        fr.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        fr.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/friend"));
        s.sendMessage(fr);

        TextComponent sr = new TextComponent(TextComponent.fromLegacyText("§a > §7/contact - Список контактов сервера"));
        sr.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        sr.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/contact"));
        s.sendMessage(sr);

        TextComponent cr = new TextComponent(TextComponent.fromLegacyText("§a > §7/changepass <пароль> <повтор пароля> - Сменить пароль аккаунта на сервере"));
        cr.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
        cr.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/changepass "));
        s.sendMessage(cr);

        if(s.hasPermission("dreamtime.help.find")) {
            TextComponent dc = new TextComponent(TextComponent.fromLegacyText("§a > §7/find <ник> - Увидеть, на каком реалме игрок"));
            dc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
            dc.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/find "));
            s.sendMessage(dc);
        }

        if(s instanceof ProxiedPlayer) {
            if(s.hasPermission("dreamtime.help.donatechat")) {
                TextComponent dc = new TextComponent(TextComponent.fromLegacyText("§a > §7/dc <сообщение> - Написать сообщение в донатерский чат"));
                dc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
                dc.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/dc "));
                s.sendMessage(dc);
            }

            if(s.hasPermission("dreamtime.help.staffchat")) {
                TextComponent dc = new TextComponent(TextComponent.fromLegacyText("§a > §7/sc <сообщение> - Написать сообщение в чат персонала"));
                dc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
                dc.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/sc "));
                s.sendMessage(dc);
            }

            if(s.hasPermission("dreamtime.help.list")) {
                TextComponent dc = new TextComponent(TextComponent.fromLegacyText("§a > §7/list - Увидеть список игроков на реалме"));
                dc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
                dc.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/list"));
                s.sendMessage(dc);
            }

            if(s.hasPermission("dreamtime.help.glist")) {
                TextComponent dc = new TextComponent(TextComponent.fromLegacyText("§a > §7/glist - Увидеть список игроков на сервере"));
                dc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Нажми, чтобы ввести эту команду!")));
                dc.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/glist"));
                s.sendMessage(dc);
            }
        } else {
            s.sendMessage(new TextComponent("§cДальше команды только для игроков с:"));
        }
    }
}
