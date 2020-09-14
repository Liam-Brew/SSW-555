package com.gedcom;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Class representing a line from a GEDCOM file.
 *
 * @author Liam Brew
 * @version 1.0
 * @date 14 September 2020
 * @pledge I pledge my honor that I have abided by the Stevens Honor System
 */
public class Line {
    private final String line;

    private final String delimiter = " ";

    private Tag tagEnum;

    private LinkedList<String> list;

    private Integer level;

    private String tag;

    private Boolean valid;

    private Character validChar = 'N';

    private String arguments;

    private Group group;

    public Line(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public Tag getTagEnum() {
        return tagEnum;
    }

    public void setTagEnum(Tag tagEnum) {
        this.tagEnum = tagEnum;
    }

    public LinkedList<String> getList() {
        return list;
    }

    public void setList(LinkedList<String> list) {
        this.list = list;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Character getValidChar() {
        return validChar;
    }

    public void setValidChar(Character validChar) {
        this.validChar = validChar;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void parseLine() {
        this.setList(new LinkedList<String>(Arrays.asList(line.split(delimiter))));

        this.setLevel(Integer.parseInt(Objects.requireNonNull(this.list.poll())));

        this.findTag();
        this.determineGroup();

        this.setArguments(String.join(delimiter, this.list));
        this.list.clear();

        if (valid) this.setValidChar('Y');
    }

    public void printLine() {
        System.out.printf("--> %s\n", this.line);
        System.out.printf("<-- %d|%s|%c|%s\n", this.level, this.tag, this.validChar, this.arguments);
    }

    public void determineGroup() {
        if (this.tagEnum == Tag.INDI) this.group = Group.INDI;
        else if (this.tagEnum == Tag.FAM) this.group = Group.FAM;
    }

    public void findTag() {
        if (this.list.size() == 1) {
            this.setTag(this.list.poll());
            if (Tag.contains(this.getTag())) {
                this.setValid(true);
                this.setTagEnum(Tag.valueOf(tag));
            } else {
                setValid(false);
            }
            return;
        }

        String second = this.list.peek();

        int secondIndex = list.indexOf(second);
        int thirdIndex = secondIndex + 1;

        String third = list.get(thirdIndex);

        Boolean tagSecond = Tag.contains(second);
        Boolean tagThird = Tag.contains(third);

        if (tagSecond) {   /* Second index is a tag: this is not an INDI or a FAM */
            this.setTag(list.poll());
            this.setTagEnum(Tag.valueOf(tag));
            this.setValid(true);
        } else if (tagThird) {  /* Third index is a tag: this is an INDI or a FAM */
            this.setTag(list.get(thirdIndex));
            this.setTagEnum(Tag.valueOf(third));
            this.list.remove(thirdIndex);
            this.setValid(true);
        } else {
            this.tag = list.poll();
            this.setValid(false);
        }
    }


}
