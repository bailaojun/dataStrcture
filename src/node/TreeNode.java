package node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * NodeTest
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/19 10:46
 */

public class TreeNode {
    private String id;
    private String name;
    private List<TreeNode> children;

    public <E> TreeNode(String s, String root, ArrayList<E> es) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    // 构造方法和其他属性的getter和setter省略

    // 上移节点
    public static void moveUp(List<TreeNode> tree, String nodeId) {
        TreeNode node = findNode(tree, nodeId);
        if (node != null) {
            TreeNode parent = findParent(tree, nodeId);
            if (parent != null) {
                List<TreeNode> siblings = parent.getChildren();
                int index = siblings.indexOf(node);
                if (index > 0) {
                    Collections.swap(siblings, index, index - 1);
                }
            }
        }
    }

    // 下移节点
    public static void moveDown(List<TreeNode> tree, String nodeId) {
        TreeNode node = findNode(tree, nodeId);
        if (node != null) {
            TreeNode parent = findParent(tree, nodeId);
            if (parent != null) {
                List<TreeNode> siblings = parent.getChildren();
                int index = siblings.indexOf(node);
                if (index < siblings.size() - 1) {
                    Collections.swap(siblings, index, index + 1);
                }
            }
        }
    }

    // 查找节点
    private static TreeNode findNode(List<TreeNode> tree, String nodeId) {
        for (TreeNode node : tree) {
            if (node.getId().equals(nodeId)) {
                return node;
            }
            TreeNode found = findNode(node.getChildren(), nodeId);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

    // 查找父节点
    // 树形结构中查找指定节点的父节点
    private static TreeNode findParent(List<TreeNode> tree, String nodeId) {
        // 在遍历过程中，首先检查当前节点是否与目标节点的ID相匹配。
        // 如果匹配，则说明当前节点是根节点，没有父节点，因此返回null
        for (TreeNode node : tree) {
            if (node.getId().equals(nodeId)) {
                return null;  // 找到的节点是根节点，没有父节点
            }

            TreeNode parent = findParent(node.getChildren(), nodeId);
            if (parent != null) {
                return parent;
            }
        }
        for (TreeNode node : tree) {
            if (node.getChildren().stream().anyMatch(child -> child.getId().equals(nodeId))) {
                return node;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        // 创建树形结构
        TreeNode root = new TreeNode("1", "Root", new ArrayList<>());
        TreeNode node1 = new TreeNode("2", "Node 1", new ArrayList<>());
        TreeNode node2 = new TreeNode("3", "Node 2", new ArrayList<>());
        TreeNode node3 = new TreeNode("4", "Node 3", new ArrayList<>());
        root.getChildren().add(node1);
        root.getChildren().add(node2);
        root.getChildren().add(node3);







// 上移节点
        TreeNode.moveUp(root.getChildren(), "3");

// 下移节点
        TreeNode.moveDown(root.getChildren(), "2");
    }





}


